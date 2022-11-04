package googleStartEx.FarmEx;

public class WoodenStructureAdapter implements WoodenStructures{
    Animal animal;

    public WoodenStructureAdapter(Animal animal){
        this.animal = animal;
    }
    @Override
    public void roll() {
        animal.move();
    }

    @Override
    public void replicate() {
        animal.mate(this.animal);
    }
}
