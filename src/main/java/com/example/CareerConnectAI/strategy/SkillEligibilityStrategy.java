package com.example.CareerConnectAI.strategy;

import com.example.CareerConnectAI.entity.PlacementDrive;
import com.example.CareerConnectAI.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class SkillEligibilityStrategy implements EligibilityStrategy {

    @Override
    public boolean isEligible(Student student, PlacementDrive drive) {

        return student.getSkills()
                .containsAll(drive.getRequiredSkills());

    }
}