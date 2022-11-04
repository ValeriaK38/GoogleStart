package googleStartEx.FarmEx;

import Utills.NameGenerator;

import java.util.List;
import java.util.Random;

public class Farmer {

    private Farm farm;

    private NameGenerator farmNames;
//    List<Animal> animalList = new ArrayList<>();

    public Farmer(List inputFarmNameList) {
        // creating farm from list of farm names
        farmNames = new NameGenerator(inputFarmNameList);
        farm = new Farm(farmNames.getName());
//        animalList = farm.getAnimalList();
    }

    public Farm getFarm() {
        return farm;
    }

    public Animal getAnimal(){
        List<Animal> farmAnimalList = this.farm.getAnimalList();
        Random rand = new Random();
        return farmAnimalList.get(rand.nextInt(farmAnimalList.size()));
    }

    public void setFarm(Farm farm) {
        this.farm = farm;
    }

    public void move(Animal animal){
        animal.move();
    }
    public List<Animal> getAnimals(){
        return farm.getAnimalList();
    }

    @Override
    public String toString() {
        return "Farmer["+ farm +']';
    }
}