package com.example.CareerConnectAI.entity;

import com.example.CareerConnectAI.enums.ApplicationStatus;

import java.time.LocalDate;

public class Application {

    private String id;
    private String studentId;
    private String driveId;
    private ApplicationStatus status;
    private LocalDate appliedDate;

    // Default Constructor
    public Application() {
    }

    // Parameterized Constructor
    public Application(String id, String studentId, String driveId,
                       ApplicationStatus status, LocalDate appliedDate) {
        this.id = id;
        this.studentId = studentId;
        this.driveId = driveId;
        this.status = status;
        this.appliedDate = appliedDate;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDriveId() {
        return driveId;
    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public LocalDate getAppliedDate() {
        return appliedDate;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setDriveId(String driveId) {
        this.driveId = driveId;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }

    public void setAppliedDate(LocalDate appliedDate) {
        this.appliedDate = appliedDate;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id='" + id + '\'' +
                ", studentId='" + studentId + '\'' +
                ", driveId='" + driveId + '\'' +
                ", status=" + status +
                ", appliedDate=" + appliedDate +
                '}';
    }
}