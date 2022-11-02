package org.example.VehiclePetternsEx;

public class Passenger {
    private final String name;
    private final Vehicle favoriteVehicle;

    public Passenger(String name, Vehicle favoriteVehicle) {
        this.name = name;
        this.favoriteVehicle = favoriteVehicle;
    }

    public String getName() {
        return name;
    }

    public Vehicle getFavoriteVehicle() {
        return favoriteVehicle;
    }

}
