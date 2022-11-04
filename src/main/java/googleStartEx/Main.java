package googleStartEx;

import Utills.NameGenerator;
import googleStartEx.VehiclePetternsEx.Agency;
import googleStartEx.VehiclePetternsEx.Passenger;
import googleStartEx.VehiclePetternsEx.VehicleType;
import googleStartEx.Visitor.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
///////////////////////////////////////////////////////////////////// Vehicle Ex
        java.util.List<String> firsNameListMale = Arrays.asList("John", "Benji", "Alex", "Henry", "Nick", "Mike", "Alon", "Ron");
        NameGenerator firsNames = new NameGenerator(firsNameListMale);

        Agency agency = Agency.getInstance();

        List<Passenger> passengerList = new ArrayList<>();
        for (int i = 0; i< ThreadLocalRandom.current().nextInt(1, 10 + 1); i++){
            passengerList.add(new Passenger(firsNames.getName(), VehicleType.BOAT));
        }

        for (int i = 0; i< ThreadLocalRandom.current().nextInt(1, 10 + 1); i++){
            passengerList.add(new Passenger(firsNames.getName(), VehicleType.TAXI));
        }

        for (int i = 0; i< ThreadLocalRandom.current().nextInt(1, 10 + 1); i++){
            passengerList.add(new Passenger(firsNames.getName(), VehicleType.PLANE));
        }
        for (int i = 0; i< ThreadLocalRandom.current().nextInt(1, 10 + 1); i++){
            passengerList.add(new Passenger(firsNames.getName(), VehicleType.BUS));
        }
        System.out.println(agency);
        System.out.println("=======================================================");
        for (Passenger passenger: passengerList
             ) {
            System.out.println(passenger);
            agency.assignPassengerToFavoriteVehicle(passenger);
            System.out.println("=======================================================");
        }
///////////////////////////////////////////////////////////////////// BUILDER
//        JobPosition programmer = new JobPosition.Builder(LocalDateTime.now(), "Web Developer",true ).build();
//        JobPosition designer = new JobPosition.Builder(LocalDateTime.now(), "Fashion Designer",false ).location(Location.TEL_AVIV).salaryCap(10000.0).build();
///////////////////////////////////////////////////////////////////// VISITOR
//        List<Appliance> appliances = new ArrayList<>();
//        appliances.add(new User("David",125563, "david123"));
//        appliances.add(new User("David",123, "david123"));
//        appliances.add(new Group(1,12));
//        appliances.add(new Asset(777,"Alen", 12.5));
//
//        ExportToJsonVisitor exportToJsonVisitor = new ExportToJsonVisitor();
//        for (Appliance appliance: appliances
//             ) {
//            appliance.accept(exportToJsonVisitor);
//        }
    }
}