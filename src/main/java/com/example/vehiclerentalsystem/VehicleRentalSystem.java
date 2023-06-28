package com.example.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.example.vehiclerentalsystem.RentalManager.*;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        //Create an instance of RentalManager to populate the vehicle lists
        RentalManager rentalManager = new RentalManager();

        // Get user choice and call methods
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the car rental system!\nChoose one of the following actions: \n 1. Rent a vehicle\n " +
                "2. Return a vehicle\n 3. View available vehicles\n 4. Exit program" );

        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                RentalManager.rentVehicle();
                break;
            case 2:
                System.out.println("You chose to return a car");
                break;
            case 3:
                System.out.println("You want to view the available cars");
                break;
            case 4:
                System.out.println("Exiting program");
                break;
            default:
                System.out.println("Invalid number. ");
                break;
        }
        scanner.close();
    }
}
