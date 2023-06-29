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

        // Display available cars
        for (int i = 0; i < availableCars.size(); i++) {
            System.out.println((i + 1) + ". " + availableCars.get(i).getDetails());
        }

        Scanner scanner = new Scanner(System.in);
        int selectedCarIndex = scanner.nextInt();

        // Check if the selected index is valid.
        if (selectedCarIndex >= 1 && selectedCarIndex <= availableCars.size()) {
            Car selectedCar = availableCars.get(selectedCarIndex - 1);
            // Perform the rental operation for the selected car
            selectedCar.isRented();
            System.out.println("You have successfully rented the car: " + selectedCar.getDetails());
        } else {
            System.out.println("Invalid car number. Please try again.");
        }

    }

    private static void rentBike() {
        System.out.println("Which bike would you like to rent?: ");
        List<Bicycle> availableBikes = Bicycle.getAvailableBikes(bikes);

        for (int i = 0; i < availableBikes.size(); i++ ) {
            System.out.println((i + 1) + ". " + availableBikes.get(i).getDetails());
        }

        Scanner scanner = new Scanner(System.in);
        int selectedBikeIndex = scanner.nextInt();

        if (selectedBikeIndex >= 1 && selectedBikeIndex <= availableBikes.size()) {
            Bicycle selectedBike = availableBikes.get(selectedBikeIndex - 1);

            selectedBike.isRented();
            System.out.println("You have successfully rented the bike");
        } else {
            System.out.println("Invalid car number. Please try again");
        }

    }

    private static void rentMotorcycle() {
        System.out.println("Which motorcycle would you like to rent?: ");
        List<Motorcycle> availableMotorcycles = Motorcycle.getAvailableMotorcycles(motorcycles);
        for (int i = 0; i < availableMotorcycles.size(); i++) {
            System.out.println((i + 1) + ". " + availableMotorcycles.get(i).getDetails());
        }

        Scanner scanner = new Scanner(System.in);
        int selectedMotorcycleIndex = scanner.nextInt();

        if (selectedMotorcycleIndex >= 1 && selectedMotorcycleIndex <= availableMotorcycles.size()) {
            Motorcycle selectedMotorcycle = availableMotorcycles.get(selectedMotorcycleIndex - 1);

            selectedMotorcycle.isRented();
            System.out.println("You successfully rented the motorcycle");
        } else {
            System.out.println("Invalid Motorcycle number. Please try again");

        }

    }
}
