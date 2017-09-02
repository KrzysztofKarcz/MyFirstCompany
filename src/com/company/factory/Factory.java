package com.company.factory;

import com.company.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Factory {


    private List<Vehicle> myCars = new ArrayList<>();
    private List<Driver> myDrivers = new ArrayList<>();


    public void addCar(Vehicle vehicle) {
        myCars.add(vehicle);
    }

    public void removeCar(Vehicle vehicle) {
        myCars.remove(vehicle);
    }

    public void addDriver(Driver driver) {
        myDrivers.add(driver);
    }

    public void removeDriver(Driver driver) {
        myDrivers.remove(driver);
    }

    public Vehicle findVehicle(String id) {
        for (Vehicle myCar : myCars) {
            if (myCar.getId().equals(id)) {
                return myCar;
            }
        }
        return null;
    }

    public Driver findDriver(String name) {
        for (Driver myDriver : myDrivers) {
            if (myDriver.getName().equals(name))
                return myDriver;
        }
        return null;
    }

    public Vehicle findVehicleByDriver(String name) {
        for (Driver myDriver : myDrivers) {
            if (myDriver.getName().equals(name))
                return myDriver.getVehicle();
        }
        return null;
    }

    public int vehiclesInRoute() {
        return vehiclesNumber(true);
    }

    public int allCars() {
        return myCars.size();
    }

    public int vehiclesInBase() {
        return vehiclesNumber(true);
    }

    private int vehiclesNumber(boolean isInRoute) {
        int result = 0;
        for (Vehicle car : myCars) {
            if (car.isInRoute() == isInRoute) {
                result++;

            }
        }
        return result;
    }


}
