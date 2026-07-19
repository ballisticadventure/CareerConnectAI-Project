package com.example.CareerConnectAI.service;

import com.example.CareerConnectAI.entity.PlacementDrive;
import com.example.CareerConnectAI.entity.Student;
import com.example.CareerConnectAI.strategy.BacklogEligibilityStrategy;
import com.example.CareerConnectAI.strategy.CgpaEligibilityStrategy;
import com.example.CareerConnectAI.strategy.SkillEligibilityStrategy;
import org.springframework.stereotype.Service;

@Service
public class EligibilityService {

    private final CgpaEligibilityStrategy cgpaStrategy;
    private final BacklogEligibilityStrategy backlogStrategy;
    private final SkillEligibilityStrategy skillStrategy;

    public EligibilityService(
            CgpaEligibilityStrategy cgpaStrategy,
            BacklogEligibilityStrategy backlogStrategy,
            SkillEligibilityStrategy skillStrategy) {

        this.cgpaStrategy = cgpaStrategy;
        this.backlogStrategy = backlogStrategy;
        this.skillStrategy = skillStrategy;
    }

    public boolean checkEligibility(Student student, PlacementDrive drive) {

        return cgpaStrategy.isEligible(student, drive)
                && backlogStrategy.isEligible(student, drive)
                && skillStrategy.isEligible(student, drive);
    }

}