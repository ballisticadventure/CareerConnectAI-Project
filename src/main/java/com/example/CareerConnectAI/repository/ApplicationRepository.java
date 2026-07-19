package com.example.CareerConnectAI.repository;

import com.example.CareerConnectAI.entity.Application;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class ApplicationRepository {
    private final Map<String, Application> applications = new HashMap<>();
    public void save(Application application) {
        applications.put(application.getId(), application);
    }
    public Application findById(String id) {
        return applications.get(id);
    }
    public List<Application> findAll() {
        return new ArrayList<>(applications.values());
    }
    public void delete(String id) {
        applications.remove(id);
    }
    public boolean exists(String id) {
        return applications.containsKey(id);
    }
}