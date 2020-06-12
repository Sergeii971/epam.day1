package com.verbovskiy.day1.service;

import com.verbovskiy.day1.exception.TaskException;
import com.verbovskiy.day1.validator.ArithmeticValidator;

public class ArithmeticService {
    public static final int RADIX = 10;

    public int calculateLastDigitSquare(double number) {
        int lastDigit = calculateLastDigit(number);
        int lastDigitSquare = (int) (Math.pow(lastDigit, 2) % 10);

        return lastDigitSquare;
    }

    public int calculateLastDigit(double number) {
        int lastDigit;
        ArithmeticValidator arithmeticValidator = new ArithmeticValidator();
        String numberStringFormat = Double.toString(number);

        if (arithmeticValidator.isInt(numberStringFormat)) {
            lastDigit = (int) number % 10;
        } else {
            lastDigit = Character.digit(numberStringFormat.charAt(numberStringFormat.length() - 1), RADIX);
        }

        return lastDigit;
    }

    public boolean isTwoEvenNumber(int ...numbers) throws TaskException {
        ArithmeticValidator arithmeticValidator = new ArithmeticValidator();
        int evenCount = 0;

        if (!arithmeticValidator.validateNumberCount(numbers)){
            throw new TaskException("количество чисел не соотвествует заданию");
        }
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount >= 2;
    }

    public boolean isPerfect(int number) {
        int dividerSum = calculateDividerSum(number);

        return (number == dividerSum);
    }

    public int calculateDividerSum(int number) {
        int dividerSum = 0;
        double dividerLimit = Math.abs(number) / 2 + 1;

        for (int divider = 1; divider <= dividerLimit; divider++) {
            if ((number % divider) == 0) {
                dividerSum += divider;
            }
        }
        return dividerSum;
    }
}
