package com.verbovskiy.day1.validator;

public class ArithmeticValidator {

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

        if (numbers.length != 4) {
            result = false;
        }
        return result;
    }

}
