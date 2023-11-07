package homework.day9.stream;

import java.util.stream.Stream;

public class CarsRunner {
    public static void main(String[] args) {
       Stream<String> cars = Stream.of("Мерс", "Ауди", "Жигуль", "Рено", "Жигуль", "Жигуль", "Ауди");

       //Оставить в потоке только уникальные названия авто
       cars = cars.distinct();

       //Отфильтровать только те названия, которые содержат букву "и"
        cars = cars.filter(s -> s.contains("и"));

        //Пропустить 1 название
        cars = cars.skip(1);

        //Все названия привести в верхний регистр
        cars =  cars.map(s->s.toUpperCase());

        //Отпечатать все названия в консоль с новой строки
       cars.forEach(System.out::println);

    }
}
