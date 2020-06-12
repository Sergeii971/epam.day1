package com.verbovskiy.day1.entity;

public class Dot {
    private double xCoordinate;
    private double yCoordinate;

    public void setXCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public double getXCoordinate() {
        return xCoordinate;
    }

    public double getYCoordinate() {
        return yCoordinate;
    }

    public Dot(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (this.getClass() != o.getClass() || o == null) {
            return false;
        }
        Dot other = (Dot) o;
        return (this.xCoordinate == other.xCoordinate && this.yCoordinate == other.yCoordinate);
    }

    @Override
    public int hashCode() {
        long longBits = Double.doubleToLongBits(this.xCoordinate);
        long longBits2 = Double.doubleToLongBits(this.yCoordinate);
        int result = 1;

        result = 37 * result + (int)(longBits - (longBits >>> 32));
        result = 37 * result + (int)(longBits2 - (longBits2 >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return String.format("[%f;%f]", this.xCoordinate, this.yCoordinate);
    }
}
