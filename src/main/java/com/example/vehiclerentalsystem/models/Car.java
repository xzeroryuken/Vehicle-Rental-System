package com.example.vehiclerentalsystem.models;

import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle {
    int numberOfSeats = 4;

    public Car(String make, String model, int year, int numberOfSeats) {
        super(make, model, year);
        this.numberOfSeats = numberOfSeats;
    }

    public static List<Car> getAvailableCars(List<Car> cars) {
        List<Car> availableCars = new ArrayList<>();
        for (Car car : cars) {
            if (!car.isRented()) {
                availableCars.add(car);
            }

        }
        return availableCars;
    }
}
