package com.example.CareerConnectAI.repository;

import com.example.CareerConnectAI.entity.PlacementDrive;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PlacementDriveRepository {
    private final Map<String, PlacementDrive> drives = new HashMap<>();
    public void save(PlacementDrive drive) {
        drives.put(drive.getId(), drive);
    }
    public PlacementDrive findById(String id) {
        return drives.get(id);
    }
    public List<PlacementDrive> findAll() {
        return new ArrayList<>(drives.values());
    }
    public void delete(String id) {
        drives.remove(id);
    }
    public boolean exists(String id) {
        return drives.containsKey(id);
    }
}