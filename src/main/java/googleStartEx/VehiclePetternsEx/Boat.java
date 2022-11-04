package googleStartEx.VehiclePetternsEx;

public class Boat implements Vehicle {

    private VehicleType vehicleType = VehicleType.BOAT;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public void transport() {
        System.out.println("Boat");
    }

    @Override
    public String toString() {
        return "Type=" + vehicleType +"\n";
    }
}
