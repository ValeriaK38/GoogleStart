package org.example.VehiclePetternsEx;

public class Passenger {
    private final String name;
    private final VehicleType favoriteVehicle;

    public Passenger(String name, VehicleType favoriteVehicle) {
        this.name = name;
        this.favoriteVehicle = favoriteVehicle;
    }

    public String getName() {
        return name;
    }

    public VehicleType getFavoriteVehicle() {
        return favoriteVehicle;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", favoriteVehicle=" + favoriteVehicle +
                '}';
    }
}
