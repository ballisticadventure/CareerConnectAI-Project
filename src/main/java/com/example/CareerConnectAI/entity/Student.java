package com.example.CareerConnectAI.entity;

import java.util.List;

public class Student {
    private String id;
    private String name;
    private String email;
    private String programme;
    private int graduationYear;
    private double cgpa;
    private int activeBacklogs;
    private List<String> skills;
    // Default Constructor
    public Student() {
    }
    // Parameterized Constructor
    public Student(String id, String name, String email, String programme,
                   int graduationYear, double cgpa, int activeBacklogs,
                   List<String> skills) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.programme = programme;
        this.graduationYear = graduationYear;
        this.cgpa = cgpa;
        this.activeBacklogs = activeBacklogs;
        this.skills = skills;
    }
    // Getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getProgramme() {
        return programme;
    }
    public int getGraduationYear() {
        return graduationYear;
    }
    public double getCgpa() {
        return cgpa;
    }
    public int getActiveBacklogs() {
        return activeBacklogs;
    }
    public List<String> getSkills() {
        return skills;
    }
    // Setters
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setProgramme(String programme) {
        this.programme = programme;
    }
    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public void setActiveBacklogs(int activeBacklogs) {
        this.activeBacklogs = activeBacklogs;    }
    public void setSkills(List<String> skills) {
        this.skills = skills;    }
    // toString()
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", programme='" + programme + '\'' +
                ", graduationYear=" + graduationYear +
                ", cgpa=" + cgpa +
                ", activeBacklogs=" + activeBacklogs +
                ", skills=" + skills +
                '}';
    }
}