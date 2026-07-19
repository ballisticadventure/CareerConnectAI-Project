package com.example.CareerConnectAI.config;

import com.example.CareerConnectAI.entity.Company;
import com.example.CareerConnectAI.entity.PlacementDrive;
import com.example.CareerConnectAI.entity.Student;
import com.example.CareerConnectAI.service.CompanyService;
import com.example.CareerConnectAI.service.PlacementDriveService;
import com.example.CareerConnectAI.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {
    private final StudentService studentService;
    private final CompanyService companyService;
    private final PlacementDriveService driveService;
    public DataInitializer(StudentService studentService,
                           CompanyService companyService,
                           PlacementDriveService driveService) {
        this.studentService = studentService;
        this.companyService = companyService;
        this.driveService = driveService;
    }
    @Override
    public void run(String... args) {
        // Students
        studentService.registerStudent(new Student(
                "25CSU372",
                "Shaurya Sharma",
                "shauryass@gmail.com",
                "B.Tech CSE",
                2029,
                8.6,
                0,
                List.of("Java","Spring Boot","SQL")
        ));
        studentService.registerStudent(new Student(
                "25CSU386",
                "Aryaveer Sajwal",
                "arya@gmail.com",
                "B.Tech CSE",
                2029,
                7.2,
                2,
                List.of("Java","SQL")
        ));
        studentService.registerStudent(new Student(
                "25CSU300",
                "Arshita Sharma",
                "kira@gmail.com",
                "BCA",
                2028,
                9.5,
                0,
                List.of("Java","Spring Boot","SQL")
        ));
        studentService.registerStudent(new Student(
                "25CSU390",
                "Aman Gupta",
                "aman@gmail.com",
                "B.Tech CSE",
                2027,
                6.4,
                3,
                List.of("Python","Machine Learning")
        ));
        // Companies
        companyService.addCompany(new Company(
                "COMP001",
                "Google",
                "Technology",
                "Global Technology Company"
        ));
        companyService.addCompany(new Company(
                "COMP002",
                "Microsoft",
                "Technology",
                "Software Company"
        ));
        // Placement Drives
        driveService.addDrive(new PlacementDrive(
                "DRIVE001",
                "COMP001",
                "Backend Developer",
                "Delhi",
                18,
                LocalDate.of(2026,12,31),
                8.0,
                0,
                List.of("Java","Spring Boot","SQL")
        ));
        driveService.addDrive(new PlacementDrive(
                "DRIVE002",
                "COMP002",
                "AI Engineer",
                "Gurgaon",
                20,
                LocalDate.of(2026,11,30),
                8.5,
                0,
                List.of("Python","Machine Learning")
        ));
        System.out.println("Sample data loaded successfully!");
    }
}