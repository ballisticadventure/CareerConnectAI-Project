package com.example.CareerConnectAI.controller;

import com.example.CareerConnectAI.entity.PlacementDrive;
import com.example.CareerConnectAI.entity.Student;
import com.example.CareerConnectAI.service.EligibilityService;
import com.example.CareerConnectAI.service.PlacementDriveService;
import com.example.CareerConnectAI.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eligibility")
public class EligibilityController {

    private final StudentService studentService;
    private final PlacementDriveService driveService;
    private final EligibilityService eligibilityService;

    public EligibilityController(
            StudentService studentService,
            PlacementDriveService driveService,
            EligibilityService eligibilityService) {

        this.studentService = studentService;
        this.driveService = driveService;
        this.eligibilityService = eligibilityService;
    }

    @GetMapping("/{studentId}/{driveId}")
    public String checkEligibility(
            @PathVariable String studentId,
            @PathVariable String driveId) {

        Student student = studentService.getStudent(studentId);
        PlacementDrive drive = driveService.getDrive(driveId);

        boolean eligible =
                eligibilityService.checkEligibility(student, drive);

        if (eligible) {
            return "Student is Eligible";
        }

        return "Student is NOT Eligible";
    }

}