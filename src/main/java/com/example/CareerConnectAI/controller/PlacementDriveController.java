package com.example.CareerConnectAI.controller;

import com.example.CareerConnectAI.entity.PlacementDrive;
import com.example.CareerConnectAI.service.PlacementDriveService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drives")
public class PlacementDriveController {

    private final PlacementDriveService service;

    public PlacementDriveController(PlacementDriveService service) {
        this.service = service;
    }
    @PostMapping
    public String addDrive(@RequestBody PlacementDrive drive) {
        service.addDrive(drive);
        return "Placement Drive added successfully.";
    }
    @GetMapping("/{id}")
    public PlacementDrive getDrive(@PathVariable String id) {
        return service.getDrive(id);
    }
    @GetMapping
    public List<PlacementDrive> getAllDrives() {
        return service.getAllDrives();
    }
    @DeleteMapping("/{id}")
    public String deleteDrive(@PathVariable String id) {
        service.deleteDrive(id);
        return "Placement Drive deleted successfully.";
    }
}