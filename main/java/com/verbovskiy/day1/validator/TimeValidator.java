package com.verbovskiy.day1.validator;

public class TimeValidator {
    public static final int MAX_MONTH = 12;
    public static final int MAX_SECOND_IN_DAY = 86400;

    public boolean validateMonth(int month) {
             return ((month >= 1) && (month <= MAX_MONTH));
    }

    public boolean validateSecondNumberInDay(int secondNumber) {
        return ((secondNumber >= 0) && (secondNumber <= MAX_SECOND_IN_DAY));
    }
}
