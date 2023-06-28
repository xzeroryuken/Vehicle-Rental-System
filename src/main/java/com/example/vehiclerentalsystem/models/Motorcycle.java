package com.example.vehiclerentalsystem.models;

import java.util.ArrayList;
import java.util.List;

public class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year) {
        super(make, model, year);
    }

    public static List<Motorcycle> getAvailableMotorcycles(List<Motorcycle> motorcycles) {
        List<Motorcycle> availableMotorcycles = new ArrayList<>();
        for (Motorcycle motorcycle : motorcycles) {
            if (!motorcycle.rented) {
                availableMotorcycles.add(motorcycle);
            }
        }
        return availableMotorcycles;
    }
}
