package com.example.CareerConnectAI.service;

import com.example.CareerConnectAI.entity.Application;
import com.example.CareerConnectAI.repository.ApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationService {
    private final ApplicationRepository repository;
    public ApplicationService(ApplicationRepository repository) {
        this.repository = repository;
    }
    public void apply(Application application) {
        if(repository.exists(application.getId())){
            throw new RuntimeException("Application already exists.");
        }
        repository.save(application);
    }
    public Application getApplication(String id){
        return repository.findById(id);
    }
    public List<Application> getAllApplications(){
        return repository.findAll();
    }
    public void deleteApplication(String id){
        repository.delete(id);
    }
}