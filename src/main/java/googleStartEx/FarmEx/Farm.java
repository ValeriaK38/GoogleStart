package googleStartEx.FarmEx;
import Utills.UniqueLongOfTenDigits;
import java.util.ArrayList;
import java.util.List;

public class Farm {
    String farmName;
    private List<Animal> animalList = new ArrayList<>();

    public Farm(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public Farm(String farmName) {
        this.farmName = farmName;
//        for(int i = 0; i< 10; i++){
//            acquire(AnimalType.randomAnimalType());
//        }
    }

    public Animal acquire(AnimalType animalType) {
        UniqueLongOfTenDigits id = new UniqueLongOfTenDigits();
        switch (animalType) {
            case GOAT:
                Animal goat = new Goat(Gender.randomGender(),id.getID(), (2 + Math.random() * (6 - 2)));
                animalList.add(goat);
                return goat;
            case DOG:
                Animal dog = new Dog(Gender.randomGender(), id.getID(), (5 + Math.random() * (10 - 5)));
                animalList.add(dog);
                return dog;
            case COW:
                Animal cow = new Cow(Gender.randomGender(), id.getID(), (7 + Math.random() * (12 - 7)));
                animalList.add(cow);
                return cow;
            default:
                throw new RuntimeException("No such animal - you can't acquire it");
        }
    }

    public Animal mate(Animal animal1, Animal animal2) {
        Animal newAnimal = animal1.mate(animal2);
        animalList.add(newAnimal);
        return newAnimal;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    @Override
    public String toString() {
        return "farmName: " + farmName + "\n" +
                "animalList: " + animalList;
    }
}
