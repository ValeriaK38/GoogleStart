package googleStartEx.FarmEx;

import Utills.UniqueLongOfTenDigits;

 class Goat extends FarmAnimal implements Animal{
    public Goat(Gender gender, long id, double weight) {
        super(AnimalType.GOAT, gender, id, weight);
    }
     @Override
     public AnimalType getType() {
         return super.getType();
     }
     public void goatSound(){
        System.out.println("Beee Beee ");
     }
     @Override
    public void move() {
         System.out.println("Goat move");
    }

    @Override
    public Animal mate(Animal animal) {
        if (!this.getClass().equals( animal.getClass()))
            throw new RuntimeException("Animals of different type can't mate");
        if(this.getGender().equals(animal.getGender()))
            throw new RuntimeException("Animals of the same gender can't mate");
        UniqueLongOfTenDigits id = new UniqueLongOfTenDigits();
        return new Goat(Gender.randomGender(), id.getID(), (2 + Math.random() * (6 - 2)));
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
     public String toString() {
         return getType() +" "+super.toString();
     }
 }