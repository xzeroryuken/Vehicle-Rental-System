package com.example.vehiclerentalsystem.models;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    int speed;
    int cost;
    String make;
    String model;
    int year;
    boolean rented;


    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.rented = false;
    }

    public String getDetails() {
        return "Make: " + make + " Model: " + model + " Year: " + year;
    }

    public boolean isRented() {
        return rented;
    }

    public void returnVehicle() {
        this.rented = false;
    }

    public static List<Vehicle> getAllVehicles(List<Vehicle> vehicles) {
        return new ArrayList<>(vehicles);
    }







}
