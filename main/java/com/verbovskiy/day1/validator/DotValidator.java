package com.verbovskiy.day1.validator;

public class DotValidator {

    public boolean validateStep(double minimumValue, double maximumValue, double argumentStep) {
        double cutLength = Math.abs(maximumValue - minimumValue);
        return ((argumentStep < cutLength) && (argumentStep > 0));
    }
}

