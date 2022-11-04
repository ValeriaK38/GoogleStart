package org.example.VehiclePetternsEx;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Agency {

    private static Agency instance;
    private final HashMap<Passenger, VehicleType> passengerOnVehicle = new HashMap<>();
    List<Vehicle> availableVehicles = new ArrayList<>();
    List<Vehicle> occupiedVehicles = new ArrayList<>();

    public static Agency getInstance() {
        if (instance == null) {
            instance = new Agency();
        }
        return instance;
    }

    private Agency() {
        for(int i =0; i<4; i++){
            availableVehicles.add(new Bus());
        }
        for(int i =0; i<8; i++){
            availableVehicles.add(new Taxi());
        }
        for(int i =0; i<3; i++){
            availableVehicles.add(new Boat());
        }
        availableVehicles.add(new Plane());
        Collections.shuffle(availableVehicles);

    }

    public void assignPassengerToFavoriteVehicle(Passenger passenger) {
        List<Vehicle> availableFavoriteVehicles = availableVehicles.stream().filter(vehicle -> vehicle.getVehicleType().equals(passenger.getFavoriteVehicle())).collect(Collectors.toList());
        if(!availableFavoriteVehicles.isEmpty()){
            passengerOnVehicle.put(passenger, passenger.getFavoriteVehicle());
            occupiedVehicles.add(availableFavoriteVehicles.get(0));
            availableVehicles.remove(availableFavoriteVehicles.get(0));
            System.out.println(passenger.getFavoriteVehicle() + " was assigned to "+ passenger.getName());
        }
        else {System.out.println("all "+ passenger.getFavoriteVehicle() + " are occupied we'll check other options:");
            assignPassengerToAvailableVehicle(passenger);
        }
        if(availableVehicles.isEmpty()){
            for (Vehicle vehicle:occupiedVehicles
                 ) {
                vehicle.transport();
            }
        }
    }
    private void assignPassengerToAvailableVehicle(Passenger passenger) {
        if(availableVehicles.size() == 0)
        {
            System.out.println("No available vehicles found");
        }
        else {
            Vehicle randomAvailableVehicle = availableVehicles.get(0);
            availableVehicles.remove(0);
            occupiedVehicles.add(randomAvailableVehicle);
            System.out.println("the passenger was assign to " +randomAvailableVehicle.getVehicleType());
        }
    }

    @Override
    public String toString() {
        return "Agency{" +
                "passengerOnVehicle=" + passengerOnVehicle +"\n"+
                ", availableVehicles=" + availableVehicles +"\n"+
                ", occupiedVehicles=" + occupiedVehicles +"\n"+
                '}';
    }
}
