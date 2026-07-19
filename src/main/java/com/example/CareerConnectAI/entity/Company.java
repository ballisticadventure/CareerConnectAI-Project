package com.example.CareerConnectAI.entity;

public class Company {
    private String id;
    private String name;
    private String sector;
    private String description;
    // Default Constructor
    public Company() {
    }
    // Parameterized Constructor
    public Company(String id, String name, String sector, String description) {
        this.id = id;
        this.name = name;
        this.sector = sector;
        this.description = description;
    }
    // Getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getSector() {
        return sector;
    }
    public String getDescription() {
        return description;
    }
    // Setters
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    // toString()
    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sector='" + sector + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}