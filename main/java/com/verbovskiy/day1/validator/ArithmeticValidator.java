package com.verbovskiy.day1.validator;

public class ArithmeticValidator {
    public static final int COUNT_OF_NUMBERS_BY_CONDITION = 4;

    public boolean isInt(String number) throws NumberFormatException {
        try {
            Integer.parseInt(number);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isDouble(String number) throws NumberFormatException {
        try {
            Double.parseDouble(number);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean validateNumberCount(int ... numbers) {
        boolean result = true;

        if (numbers.length != COUNT_OF_NUMBERS_BY_CONDITION) {
            result = false;
        }
        return result;
    }

}
