package com.example.CareerConnectAI.controller;

import com.example.CareerConnectAI.entity.Student;
import com.example.CareerConnectAI.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentService service;
    public StudentController(StudentService service) {
        this.service = service;
    }
    @PostMapping
    public String registerStudent(@RequestBody Student student) {
        service.registerStudent(student);
        return "Student registered successfully.";
    }
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable String id) {
        return service.getStudent(id);
    }
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable String id) {
        service.deleteStudent(id);
        return "Student deleted successfully.";
    }
}