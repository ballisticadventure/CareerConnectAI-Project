package com.example.CareerConnectAI.controller;

import com.example.CareerConnectAI.entity.Application;
import com.example.CareerConnectAI.service.ApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/applications")
public class ApplicationController {

    private final ApplicationService service;
    public ApplicationController(ApplicationService service) {
        this.service = service;
    }
    @PostMapping
    public String apply(@RequestBody Application application){

        service.apply(application);

        return "Application submitted successfully.";
    }
    @GetMapping("/{id}")
    public Application getApplication(@PathVariable String id){
        return service.getApplication(id);
    }
    @GetMapping
    public List<Application> getAllApplications(){
        return service.getAllApplications();
    }
    @DeleteMapping("/{id}")
    public String deleteApplication(@PathVariable String id){

        service.deleteApplication(id);

        return "Application deleted successfully.";
    }
}