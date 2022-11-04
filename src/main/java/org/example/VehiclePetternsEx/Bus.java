package org.example.VehiclePetternsEx;

public class Bus implements Vehicle {

    private VehicleType vehicleType = VehicleType.BUS;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Type=" + vehicleType + "\n";

    }

    @Override
    public void transport() {
        System.out.println("Bus");
    }
}
