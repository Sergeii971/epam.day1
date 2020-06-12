package com.verbovskiy.day1.service;

import com.verbovskiy.day1.exception.TaskException;
import com.verbovskiy.day1.validator.TimeValidator;

import java.time.LocalTime;
import java.time.YearMonth;

public class TimeService {
    public static final int SECOND_IN_HOUR = 3600;
    public static final int SECOND_IN_MINUTE = 60;

    public int calculateLengthOfMonth(int year, int month) throws TaskException {
        TimeValidator timeValidator = new TimeValidator();
        int daysInMonth;
        if (year > 0 && timeValidator.validateMonth(month)) {
            daysInMonth = (YearMonth.of(year, month).lengthOfMonth());
        } else {
            throw new TaskException("неверный ввод года или номера месяца");
        }
        return daysInMonth;
    }

    public boolean isLeapYear(int year) throws TaskException {
        if (year < 0) {
            throw  new TaskException("неправильно введен год");
        }
    return (year % 4 == 0);
    }

    public LocalTime calculateLocalTime(int secondNumber) throws TaskException {
        TimeValidator timeValidator = new TimeValidator();

        if (!timeValidator.validateSecondNumberInDay(secondNumber)) {
            throw new TaskException("в дне не может быть столько секунд");
        }

        int hours = secondNumber / SECOND_IN_HOUR;
        secondNumber %= SECOND_IN_HOUR;
        int minutes = secondNumber / SECOND_IN_MINUTE;
        secondNumber %= SECOND_IN_MINUTE;
        int seconds = secondNumber;

        return LocalTime.of(hours, minutes, seconds);
    }
}
