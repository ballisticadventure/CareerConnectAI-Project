package com.example.CareerConnectAI.entity;

import java.time.LocalDate;
import java.util.List;

public class PlacementDrive {

    private String id;
    private String companyId;
    private String role;
    private String location;
    private double packageOffered;
    private LocalDate applicationDeadline;
    private double minimumCgpa;
    private int maximumBacklogs;
    private List<String> requiredSkills;

    // Default Constructor
    public PlacementDrive() {
    }

    // Parameterized Constructor
    public PlacementDrive(String id, String companyId, String role,
                          String location, double packageOffered,
                          LocalDate applicationDeadline,
                          double minimumCgpa,
                          int maximumBacklogs,
                          List<String> requiredSkills) {

        this.id = id;
        this.companyId = companyId;
        this.role = role;
        this.location = location;
        this.packageOffered = packageOffered;
        this.applicationDeadline = applicationDeadline;
        this.minimumCgpa = minimumCgpa;
        this.maximumBacklogs = maximumBacklogs;
        this.requiredSkills = requiredSkills;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPackageOffered() {
        return packageOffered;
    }

    public void setPackageOffered(double packageOffered) {
        this.packageOffered = packageOffered;
    }

    public LocalDate getApplicationDeadline() {
        return applicationDeadline;
    }

    public void setApplicationDeadline(LocalDate applicationDeadline) {
        this.applicationDeadline = applicationDeadline;
    }

    public double getMinimumCgpa() {
        return minimumCgpa;
    }

    public void setMinimumCgpa(double minimumCgpa) {
        this.minimumCgpa = minimumCgpa;
    }

    public int getMaximumBacklogs() {
        return maximumBacklogs;
    }

    public void setMaximumBacklogs(int maximumBacklogs) {
        this.maximumBacklogs = maximumBacklogs;
    }

    public List<String> getRequiredSkills() {
        return requiredSkills;
    }

    public void setRequiredSkills(List<String> requiredSkills) {
        this.requiredSkills = requiredSkills;
    }

    @Override
    public String toString() {
        return "PlacementDrive{" +
                "id='" + id + '\'' +
                ", companyId='" + companyId + '\'' +
                ", role='" + role + '\'' +
                ", location='" + location + '\'' +
                ", packageOffered=" + packageOffered +
                ", applicationDeadline=" + applicationDeadline +
                ", minimumCgpa=" + minimumCgpa +
                ", maximumBacklogs=" + maximumBacklogs +
                ", requiredSkills=" + requiredSkills +
                '}';
    }
}