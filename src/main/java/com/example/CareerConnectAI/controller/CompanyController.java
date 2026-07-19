package com.example.CareerConnectAI.controller;

import com.example.CareerConnectAI.entity.Company;
import com.example.CareerConnectAI.service.CompanyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    private final CompanyService service;
    public CompanyController(CompanyService service) {
        this.service = service;
    }
    @PostMapping
    public String addCompany(@RequestBody Company company){
        service.addCompany(company);
        return "Company added successfully.";
    }
    @GetMapping("/{id}")
    public Company getCompany(@PathVariable String id){
        return service.getCompany(id);
    }
    @GetMapping
    public List<Company> getAllCompanies(){
        return service.getAllCompanies();
    }
    @DeleteMapping("/{id}")
    public String deleteCompany(@PathVariable String id){
        service.deleteCompany(id);
        return "Company deleted successfully.";
    }
}