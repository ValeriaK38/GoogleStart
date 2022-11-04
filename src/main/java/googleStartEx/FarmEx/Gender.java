package googleStartEx.FarmEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

 enum Gender {
    MALE, FEMALE;

    private static final List<Gender> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    public static Gender randomGender()  {
        return VALUES.get(ThreadLocalRandom.current().nextInt(VALUES.size()));
    }
}
