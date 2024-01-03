package collections;

import java.util.SortedSet;
import java.util.TreeSet;

import collections.data.Person;
import collections.data.PersonComparator;

public class SortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator().reversed());
        people.add(new Person("hanif"));
        people.add(new Person("diar"));
        people.add(new Person("ihza"));

        for (Person person : people) {
            System.out.println(person.getName());
        }

    } 
}
