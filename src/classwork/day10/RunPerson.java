package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class RunPerson {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 28, Person.Sex.WOMAN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMAN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        long num = list.stream().filter(person -> person.age >= 18)
                .filter(person -> (person.age < 60 && person.sex == Person.Sex.MAN) || person.age < 55).count();

        System.out.println(num);

        int count = 0;
        for (Person p : list) {
            if (p.age > 18 && ((p.age<60 && p.sex== Person.Sex.MAN) || p.age<55))
               count++;
        }

        System.out.println(count);

        list.stream().sorted((p1, p2) -> p1.age-p2.age).toList();


    }
}
