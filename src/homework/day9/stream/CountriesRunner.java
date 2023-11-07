package homework.day9.stream;

import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {

        Stream<String> countries = Stream.of("јндора", "ѕортугали€", "јнгли€", "«амби€");

        //ќтфильтровать страны, которые содержат в себе хот€ бы одну гласную букву
        countries = countries.filter(s -> s.matches(".*[ја≈е®Є»иќо”уЁэёюя€]+.*"));

        //ќтфильтровать страны, в названии которых меньше 7 букв
        countries = countries.filter(s -> s.length()<7);

        //ѕеревести все страны в верхний регистр
        countries = countries.map(String::toUpperCase);

        //ƒобавить к каждому названию кавычки
        countries = countries.map(s -> ("\"" + s + "\""));

        //ќтпечатать в консоль с новой строки
        countries.forEach(System.out::println);

    }
}
