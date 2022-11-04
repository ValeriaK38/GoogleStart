package googleStartEx.VehiclePetternsEx;

public class Plane implements Vehicle {

    private VehicleType vehicleType = VehicleType.PLANE;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    @Override
    public String toString() {
        return "Type=" + vehicleType +"\n";
    }

    @Override
    public void transport() {
        System.out.println("Plane");
    }
}
