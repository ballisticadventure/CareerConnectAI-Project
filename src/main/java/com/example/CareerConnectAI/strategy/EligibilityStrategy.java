package com.example.CareerConnectAI.strategy;

import com.example.CareerConnectAI.entity.PlacementDrive;
import com.example.CareerConnectAI.entity.Student;

public interface EligibilityStrategy {

    boolean isEligible(Student student, PlacementDrive drive);

}