package com.company.vehicles;

public abstract class Vehicle {

    private String mark;
    private int weight;
    private int mileage;
    private String id;
    private boolean isInRoute;


    public Vehicle(String mark, int weight, int mileage, String id) {
        this.mark = mark;
        this.weight = weight;
        this.mileage = mileage;
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public int getWeight() {
        return weight;
    }

    public int getMileage() {
        return mileage;
    }

    public String getId() {
        return id;
    }

    public boolean isInRoute() {
        return isInRoute;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "mark = '" + mark + '\'' +
                ", weight = " + weight +
                ", mileage = " + mileage +
                ", id = '" + id + '\'' +
                ", isInRoute = " + isInRoute +
                '}';
    }
}
