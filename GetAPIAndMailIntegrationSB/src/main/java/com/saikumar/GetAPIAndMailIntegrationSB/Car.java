package com.saikumar.GetAPIAndMailIntegrationSB;

public class Car {
    private String name;
    private String color;
    private int mileage;
    private int topSpeed;
    private int seatCap;

    public Car(String name, String color, int mileage, int topSpeed, int seatCap) {
        this.name = name;
        this.color = color;
        this.mileage = mileage;
        this.topSpeed = topSpeed;
        this.seatCap = seatCap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeatCap() {
        return seatCap;
    }

    public void setSeatCap(int seatCap) {
        this.seatCap = seatCap;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", topSpeed=" + topSpeed +
                ", seatCap=" + seatCap +
                '}';
    }
}
