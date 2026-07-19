package com.example.CareerConnectAI.strategy;

import com.example.CareerConnectAI.entity.PlacementDrive;
import com.example.CareerConnectAI.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class CgpaEligibilityStrategy implements EligibilityStrategy {

    @Override
    public boolean isEligible(Student student, PlacementDrive drive) {

        return student.getCgpa() >= drive.getMinimumCgpa();

    }
}