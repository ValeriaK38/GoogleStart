package org.example;

import org.example.JobPositionEx.JobPosition;
import org.example.JobPositionEx.Location;
import org.example.Visitor.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

///////////////////////////////////////////////////////////////////// BUILDER
        JobPosition programmer = new JobPosition.Builder(LocalDateTime.now(), "Web Developer",true ).build();
        JobPosition designer = new JobPosition.Builder(LocalDateTime.now(), "Fashion Designer",false ).location(Location.TEL_AVIV).salaryCap(10000.0).build();
///////////////////////////////////////////////////////////////////// VISITOR
        List<Appliance> appliances = new ArrayList<>();
        appliances.add(new User("David",125563, "david123"));
        appliances.add(new User("David",123, "david123"));
        appliances.add(new Group(1,12));
        appliances.add(new Asset(777,"Alen", 12.5));

        ExportToJsonVisitor exportToJsonVisitor = new ExportToJsonVisitor();
        for (Appliance appliance: appliances
             ) {
            appliance.accept(exportToJsonVisitor);
        }
    }
}