package com.example.CareerConnectAI.service;

import com.example.CareerConnectAI.entity.Company;
import com.example.CareerConnectAI.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {
    private final CompanyRepository repository;
    public CompanyService(CompanyRepository repository) {
        this.repository = repository;
    }
    public void addCompany(Company company) {
        if(repository.exists(company.getId())){
            throw new RuntimeException("Company already exists.");
        }
        repository.save(company);
    }
    public Company getCompany(String id){
        return repository.findById(id);
    }
    public List<Company> getAllCompanies(){
        return repository.findAll();
    }
    public void deleteCompany(String id){
        repository.delete(id);
    }
}