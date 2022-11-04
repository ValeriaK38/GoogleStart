package googleStartEx.FarmEx;

import Utills.UniqueLongOfTenDigits;

class Dog extends FarmAnimal implements Animal{
//    private AnimalType type;
    public Dog(Gender gender, long id, double weight) {
        super( AnimalType.DOG, gender,  id,  weight);
//        this.type = AnimalType.DOG;
    }

    public void bark(){
        System.out.println("Woof, woof ^.^ *happy dog!*");
    }
    @Override
    public void move() {
        System.out.println("Dog move");
    }

    @Override
    public Animal mate(Animal animal) {
        if (!this.getClass().equals( animal.getClass()))
            throw new RuntimeException("Animals of different type can't mate");
        if(this.getGender().equals(animal.getGender()))
            throw new RuntimeException("Animals of the same gender can't mate");
        UniqueLongOfTenDigits id = new UniqueLongOfTenDigits();
        return new Dog(Gender.randomGender(), id.getID(), (5 + Math.random() * (10 - 5)));
    }

    @Override
    public long getID() {
        return super.getId();
    }

    @Override
    public double getWight() {
        return super.getWeight();
    }

    @Override
    public AnimalType getType() {
        return super.getType();
    }
    @Override
    public String toString() {
        return getType() +" "+super.toString();
    }
}