package com.company;

import com.company.vehicles.Vehicle;

public class Driver {

    private String name;
    private Vehicle vehicle;

    public Driver(String name) {
        this.name = name;
    }

    public Driver(String name, Vehicle vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
