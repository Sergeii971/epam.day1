package com.verbovskiy.day1.service;

import com.verbovskiy.day1.exception.TaskException;

public class ShapeService {
    private static final double ANGLE_BETWEEN_SIDE_DIAGONAL = 45;

    public double calculateSquareSide(double area) throws TaskException {
        if (area < 0) {
            throw new TaskException("площадь не может быть отрицательной");
        }
         return Math.sqrt(area);
    }

    public double calculateInscribedSquareSide(double circleDiameter) throws TaskException {
        if (circleDiameter < 0) {
            throw new TaskException("диаметр не может быть отрицательным");
        }
        double side = circleDiameter * Math.sin(Math.toRadians(ANGLE_BETWEEN_SIDE_DIAGONAL));
        return side;
    }

    public double calculateSquareArea(double squareSide) throws TaskException {
        if (squareSide < 0) {
            throw new TaskException("длина стороны квадрата не может быть отрицательной");
        }
        double area = Math.pow(squareSide, 2);
        return area;
    }

    public double calculateAreaRatio(double firstArea, double secondArea) throws TaskException {
        if (firstArea < 0 || secondArea < 0) {
            throw new TaskException("площадь не может быть отрицательной");
        }
        double ratio = firstArea / secondArea;
        return ratio;
    }

    public double calculateCircleArea(double radius) throws TaskException {
        if (radius < 0) {
            throw new TaskException("радиус не может быть отрицательным");
        }
       double area = Math.PI * Math.pow(radius, 2);
       return area;
    }

    public double calculateCircumference(double radius) throws TaskException {
        if (radius < 0) {
            throw new TaskException("радиус не может быть отрицательным");
        }
        double length = Math.PI * 2 * radius;
        return length;
    }
}
