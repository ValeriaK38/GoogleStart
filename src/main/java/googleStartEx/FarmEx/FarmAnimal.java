package googleStartEx.FarmEx;

import Utills.UniqueLongOfTenDigits;

import java.text.DecimalFormat;

abstract class FarmAnimal implements Animal{

    private final Gender gender;
    private final long id;
    private double weight;

    private AnimalType animalType;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public FarmAnimal(AnimalType animalType, Gender gender, long id, double weight) {
        this.gender = gender;
        this.id = id;
        this.weight = Double.parseDouble(df.format(weight));
        this.animalType = animalType;
    }

    public AnimalType getType() {
        return this.animalType;
    }

    public Gender getGender() {
        return gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        weight = Double.parseDouble(df.format(weight));
        this.weight =  weight;
    }
    public void move(){
        System.out.println("animal move");
    }

    @Override
    public String toString() {
        return gender + ", id: " + id + ", weight: " + weight;
    }

    protected long getId() {
        return this.id;
    }
}
