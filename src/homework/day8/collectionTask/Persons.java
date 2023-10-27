package homework.day8.collectionTask;

import homework.day8.objects.Person;

import java.util.ArrayList;
import java.util.List;

public class Persons {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(32,"����"));
        people.add(new Person(24,"���"));
        people.add(new Person(55,"����"));
        people.add(new Person(63,"����"));

        for (Person age: people) {
            System.out.print(age.getAge()+" ");
        }
        System.out.println();
        for (Person name: people) {
            System.out.print(name.getName()+" ");
        }
        System.out.println();
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }
    }
}
