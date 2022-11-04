package googleStartEx.FarmEx;

interface Animal {
    void move();
     Animal mate(Animal animal);
    Gender getGender();
    long getID();
    double getWight();
    AnimalType getType();
}
