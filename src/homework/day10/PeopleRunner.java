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
//        ������� ����� ������ people ������ Person (����� new Stream.of)
//        � ��������� (32, 24, 55, 63) � ������� (����, ���, ����, ����) ��������������
        Stream<Person> people = Stream.of(new Person(32,"����"), new Person(24,"���"),
                        new Person(55,"����"), new Person(63,"����"));

//        ������������� �����, ������� ������ 60

        List<Person> people1 = people.filter(person -> person.getAge()<60).peek(System.out::println).toList();

//        ������������� � ���������� ������� �� ������

        List<Person> people2 = people1.stream().sorted(Comparator.comparing(Person::getName)).peek(System.out::println).toList();

//        �� ��������� ������������� ������ ������ ������� �����, � ������� ������ ����� Person
//        ����� ������� �� 4 ���� ������ ���������

        List<Person> newPeopleStream = people2.stream().map(person -> {
            person.setAge(person.getAge() + 4);
            return person;
                })
                .toList();

        newPeopleStream.forEach(System.out::println);
//       ��������� ������� ������� ��������� ����� � ���������� � ����� ��������� ����

        int averageAge = newPeopleStream.stream().map(Person::getAge)
                .reduce((p1, p2) -> (p1 + p2) / 2).get();//����� ������ �������� age.
        System.out.println(averageAge);
        BufferedWriter out = new BufferedWriter(new FileWriter("averageAge.txt"));
        out.write(averageAge);
        out.close();//�������� %. ������?
    }
}
