package org.example.VehiclePetternsEx;

public class Taxi implements Vehicle {
    private VehicleType vehicleType = VehicleType.TAXI;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Type=" + vehicleType +"\n";
    }

    @Override
    public void transport() {
        System.out.println("Taxi");
    }
}
