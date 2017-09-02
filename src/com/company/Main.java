package com.company;

import com.company.factory.Factory;
import com.company.vehicles.Bus;
import com.company.vehicles.Car;
import com.company.vehicles.Truck;
import com.company.vehicles.Vehicle;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();

        factory.addCar(new Bus("Mercedes", 6500, 100000, "KR 1111"));
        factory.addCar(new Truck("Man", 12000, 130000, "KR 2222"));

        System.out.println(factory.allCars());


        //  Vehicle myCar = new Car("Ford", 7300, 77000, "KR 7777");

        //  System.out.println(factory.findVehicle("KR 7777"));
        //   System.out.println(factory.findVehicle("KR 1111"));


    }

}
