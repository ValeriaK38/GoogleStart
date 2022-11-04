package googleStartEx.FarmEx;

import Utills.UniqueLongOfTenDigits;

class Cow extends FarmAnimal implements Animal{
    public Cow(Gender gender, long id, double weight) {
        super(AnimalType.COW, gender, id, weight);
    }


    @Override
    public void move() {
        System.out.println("Cow move");
    }

    @Override
    public Animal mate(Animal animal) {
        if (!this.getClass().equals( animal.getClass()))
            throw new RuntimeException("Animals of different type can't mate");
        if(this.getGender().equals(animal.getGender()))
            throw new RuntimeException("Animals of the same gender can't mate");
        UniqueLongOfTenDigits id = new UniqueLongOfTenDigits();
        return new Cow(Gender.randomGender(), id.getID(), (7 + Math.random() * (12 - 7)));
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

    public void sound(){
        System.out.println("Moooo !");
    }

    @Override
    public String toString() {
        return getType() +" "+super.toString();
    }
}
