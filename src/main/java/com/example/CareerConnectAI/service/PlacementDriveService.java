package com.example.CareerConnectAI.service;

import com.example.CareerConnectAI.entity.PlacementDrive;
import com.example.CareerConnectAI.repository.PlacementDriveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementDriveService {
    private final PlacementDriveRepository repository;
    public PlacementDriveService(PlacementDriveRepository repository) {
        this.repository = repository;
    }
    public void addDrive(PlacementDrive drive) {
        if (repository.exists(drive.getId())) {
            throw new RuntimeException("Placement Drive already exists.");
        }
        repository.save(drive);
    }
    public PlacementDrive getDrive(String id) {
        return repository.findById(id);
    }
    public List<PlacementDrive> getAllDrives() {
        return repository.findAll();
    }
    public void deleteDrive(String id) {
        repository.delete(id);
    }
}