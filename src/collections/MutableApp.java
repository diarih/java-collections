package collections;

import java.util.List;

import collections.data.Person;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Ihza");
        person.addHobby("Belajar Coding");
        person.addHobby("Rebahan");

        for (String hobby : person.getHobbies()) {
            System.out.println(hobby);
        }

        // THIS CAUSE MUTATE IF LIST NOT IMMUTABLE
        doSomethingMutate(person.getHobbies());

         for (String hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingMutate(List<String> hobbies) {
        hobbies.add("Oke");
    }
}
