package com.verbovskiy.day1.service;
import com.verbovskiy.day1.entity.Dot;
import com.verbovskiy.day1.exception.TaskException;
import com.verbovskiy.day1.validator.DotValidator;

import java.util.HashMap;
import java.util.Map;

public class DotService {
    /*Method returns 1 if dot1 closer than dot2,
     * returns -1 if point2 closer than point1,
     * returns 0 if distance from origin to dot1 equals to distance
     * from origin to dot2*/
    public int calculateClosestDot(Dot dot1, Dot dot2) {
        double firstDotDistance = calculateDistance(dot1.getXCoordinate(), dot1.getYCoordinate());
        double secondDotDistance = calculateDistance(dot2.getXCoordinate(), dot2.getYCoordinate());
        if (firstDotDistance == secondDotDistance) {
            return 0;
        } else return firstDotDistance > secondDotDistance ? 1 : -1;

    }

    public double calculateDistance(double xCoordinate, double yCoordinate) {
        double distance = Math.hypot(xCoordinate, yCoordinate);
        return distance;
    }

    public double calculateFunctionValue(double x) {
    double functionValue;

        if (x >= 3) {
            functionValue = -Math.pow(x, 2) + 3 * x + 9;
        } else {
            functionValue = 1 / (Math.pow(x, 3) - 6);
        }

        return functionValue;
    }

    public Map<Double, Double> calculateTangentFunction(double minimumValue, double maximumValue,
                                                        double argumentStep) throws  TaskException {
       DotValidator dotValidator = new DotValidator();

        if (minimumValue > maximumValue) {
            throw new TaskException("неверный интервал агрумента");
        }
        if (!dotValidator.validateStep(minimumValue, maximumValue, argumentStep)) {
            throw new TaskException("неверный шаг агрумента");
        }
        double functionArgument = minimumValue;
        Map <Double, Double> dotCoordinates = new HashMap();
        double functionValue;

        while (functionArgument <= maximumValue) {
            functionValue = Math.tan(functionArgument);
            dotCoordinates.put(functionArgument, functionValue);
            functionArgument += argumentStep;
        }
        return dotCoordinates;
    }
}
