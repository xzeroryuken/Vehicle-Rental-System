package com.example.vehiclerentalsystem;

import com.example.vehiclerentalsystem.models.Bicycle;
import com.example.vehiclerentalsystem.models.Car;
import com.example.vehiclerentalsystem.models.Motorcycle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalManager
{
    // Initialize lists for available vehicles
    static List<Car> cars = new ArrayList<>();
    static List<Motorcycle> motorcycles = new ArrayList<>();
    static List<Bicycle> bikes = new ArrayList<>();

    public RentalManager() {
        // Add the different vehicles and models
        Car car1 = new Car("Toyota", "Corolla", 1997, 4);
        cars.add(car1);

        Car car2 = new Car("Toyota", "Camry", 1998, 4);
        cars.add(car2);

        Bicycle bike1 = new Bicycle("Huawei", "purpdurp", 1982, 2);
        bikes.add(bike1);

        Motorcycle motorcycle1 = new Motorcycle("Suzuki", "Hayabusa", 2008);
        motorcycles.add(motorcycle1);
    }

    static Scanner scanner = new Scanner(System.in);

    // Method that provides menu for choosing which vehicle to rent.
    public static void rentVehicle() {
        System.out.println("You chose to rent a vehicle. Which vehicle would you like to rent?\n 1. Car\n 2. Bike\n " +
                "3. Motorcycle");
        int vehicleChoice = scanner.nextInt();

        switch (vehicleChoice) {
            case 1:
                rentCar();
                break;
            case 2:
                rentBike();
                break;
            case 3:
                rentMotorcycle();
                break;
            default:
                System.out.println("Invalid vehicle option.");
                break;
        }
    }

    private static void rentCar() {
        System.out.println("Which car would you like to rent?: ");
        List<Car> availableCars = Car.getAvailableCars(cars);
        for (Car car : availableCars) {
            System.out.println(car.getDetails());
        }
    }

    private static void rentBike() {
        System.out.println("Which bike would you like to rent?: ");
        List<Bicycle> availableBikes = Bicycle.getAvailableBikes(bikes);
        for (Bicycle bike : availableBikes) {
            System.out.println(bike.getDetails());
        }
    }

    private static void rentMotorcycle() {
        System.out.println("Which motorcycle would you like to rent?: ");
        List<Motorcycle> availableMotorcycles = Motorcycle.getAvailableMotorcycles(motorcycles);
        for (Motorcycle motorcycle : availableMotorcycles) {
            System.out.println(motorcycle.getDetails());
        }
    }
}
