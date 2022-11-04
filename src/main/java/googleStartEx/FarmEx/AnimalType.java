package googleStartEx.FarmEx;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public enum AnimalType {
    COW, GOAT, DOG;

    private static final List<AnimalType> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    public static AnimalType randomAnimalType()  {
        return VALUES.get(ThreadLocalRandom.current().nextInt(VALUES.size()-1));
    }
}
