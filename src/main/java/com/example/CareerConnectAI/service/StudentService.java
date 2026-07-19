package com.example.CareerConnectAI.service;

import com.example.CareerConnectAI.entity.Student;
import com.example.CareerConnectAI.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }
    public void registerStudent(Student student) {

        if (repository.exists(student.getId())) {
            throw new RuntimeException("Student ID already exists.");
        }
        repository.save(student);
    }
    public Student getStudent(String id) {
        return repository.findById(id);
    }
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
    public void deleteStudent(String id) {
        repository.delete(id);
    }

}