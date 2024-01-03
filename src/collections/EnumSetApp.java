package collections;

import java.util.EnumSet;

public class EnumSetApp {
    public static enum Gender {
        MALE, FEMALE, NOT
    }
    
    public static void main(String[] args) {
        EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        // EnumSet<Gender> genders = EnumSet.of(Gender.FEMALE, Gender.MALE);

        for (Gender gender : genders) {
            System.out.println(gender);
        }

    }
}
