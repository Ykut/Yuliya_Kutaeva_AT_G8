package homework.day10;

import homework.day8.objects.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PeopleRunner {
    public static void main(String[] args) throws IOException {
//        Создать поток данных people класса Person (через new Stream.of)
//        с возрастом (32, 24, 55, 63) и именами (Коля, Оля, Вася, Маша) соответственно
        Stream<Person> people = Stream.of(new Person(32,"Коля"), new Person(24,"Оля"),
                        new Person(55,"Вася"), new Person(63,"Маша"));

//        Отфильтровать людей, которые моложе 60

        List<Person> people1 = people.filter(person -> person.getAge()<60).peek(System.out::println).toList();

//        Отсортировать в восходящем порядке по именам

        List<Person> people2 = people1.stream().sorted(Comparator.comparing(Person::getName)).peek(System.out::println).toList();

//        На основании существующего потока данных создать новый, в котором каждый новый Person
//        имеет возраст на 4 года больше исходного

        List<Person> newPeopleStream = people2.stream().map(person -> {
            person.setAge(person.getAge() + 4);
            return person;
                })
                .toList();

        newPeopleStream.forEach(System.out::println);
//       Вычислить средний возраст конечного людей и отпечатать в новый текстовый файл

        int averageAge = newPeopleStream.stream().map(Person::getAge)
                .reduce((p1, p2) -> (p1 + p2) / 2).get();//берет старые значения age.
        System.out.println(averageAge);
        BufferedWriter out = new BufferedWriter(new FileWriter("averageAge.txt"));
        out.write(averageAge);
        out.close();//печатает %. почему?
    }
}
