package com.example.CareerConnectAI.repository;

import com.example.CareerConnectAI.entity.Company;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CompanyRepository {

    private final Map<String, Company> companies = new HashMap<>();
    public void save(Company company) {
        companies.put(company.getId(), company);
    }
    public Company findById(String id) {
        return companies.get(id);
    }
    public List<Company> findAll() {
        return new ArrayList<>(companies.values());
    }
    public void delete(String id) {
        companies.remove(id);
    }
    public boolean exists(String id) {
        return companies.containsKey(id);
    }
}