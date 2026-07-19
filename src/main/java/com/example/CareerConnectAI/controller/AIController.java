package com.example.CareerConnectAI.controller;

import com.example.CareerConnectAI.ai.OllamaService;
import com.example.CareerConnectAI.entity.PlacementDrive;
import com.example.CareerConnectAI.entity.Student;
import com.example.CareerConnectAI.service.PlacementDriveService;
import com.example.CareerConnectAI.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ai")
public class AIController {

    private final OllamaService ollamaService;
    private final StudentService studentService;
    private final PlacementDriveService driveService;

    public AIController(OllamaService ollamaService,
                        StudentService studentService,
                        PlacementDriveService driveService) {

        this.ollamaService = ollamaService;
        this.studentService = studentService;
        this.driveService = driveService;
    }

    @GetMapping("/recommend/{studentId}/{driveId}")
    public String recommend(@PathVariable String studentId,
                            @PathVariable String driveId) {

        Student student = studentService.getStudent(studentId);
        PlacementDrive drive = driveService.getDrive(driveId);

        if (student == null) {
            return "Student not found.";
        }

        if (drive == null) {
            return "Placement Drive not found.";
        }

        String prompt =
                "You are an expert placement mentor.\n\n" +

                "Student Details:\n" +
                "Name: " + student.getName() + "\n" +
                "CGPA: " + student.getCgpa() + "\n" +
                "Backlogs: " + student.getActiveBacklogs() + "\n" +
                "Skills: " + String.join(", ", student.getSkills()) + "\n\n" +

                "Placement Drive Details:\n" +
                "Role: " + drive.getRole() + "\n" +
                "Location: " + drive.getLocation() + "\n" +
                "Package: " + drive.getPackageOffered() + " LPA\n" +
                "Minimum CGPA: " + drive.getMinimumCgpa() + "\n" +
                "Maximum Backlogs: " + drive.getMaximumBacklogs() + "\n" +
                "Required Skills: " + String.join(", ", drive.getRequiredSkills()) + "\n\n" +

                "Based on the student's profile and the placement drive requirements:\n" +
                "1. Tell whether the student appears suitable for this role.\n" +
                "2. Mention the student's strengths.\n" +
                "3. Identify any missing skills.\n" +
                "4. Suggest how the student can improve.\n" +
                "5. Give placement interview preparation tips.";

        return ollamaService.generateRecommendation(prompt);
    }
}