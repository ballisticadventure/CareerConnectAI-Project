package com.example.CareerConnectAI.repository;
import com.example.CareerConnectAI.entity.Student;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class StudentRepository {
    private final Map<String, Student> students = new HashMap<>();
    // Save Student
    public void save(Student student) {
        students.put(student.getId(), student);
    }
    // Find Student by ID
    public Student findById(String id) {
        return students.get(id);
    }
    // Get All Students
    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }
    // Delete Student
    public void delete(String id) {
        students.remove(id);
    }
    // Check if Student Exists
    public boolean exists(String id) {
        return students.containsKey(id);
    }
}