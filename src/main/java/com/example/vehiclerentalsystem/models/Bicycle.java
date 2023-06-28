package com.example.vehiclerentalsystem.models;

import java.util.ArrayList;
import java.util.List;

public class Bicycle extends Vehicle {
    int pedals = 2;

    public Bicycle(String make, String model, int year, int pedals) {
        super(make, model, year);
        this.pedals = pedals;
    }

    public static List<Bicycle> getAvailableBikes(List<Bicycle> bikes) {
        List<Bicycle> availableBikes = new ArrayList<>();
        for (Bicycle bike : bikes) {
            if (!bike.isRented()) {
                availableBikes.add(bike);
            }
        }
        return availableBikes;
    }
}
