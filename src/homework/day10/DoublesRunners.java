package homework.day10;

import homework.day8.objects.Bubble;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class DoublesRunners {
    public static void main(String[] args) {
        Stream<Double> doubles = Stream.of(33.42, 34.3, 0.79, 2.3426, 6.8, 13.24, 5.5, 769.9);

//        ќкруглить каждое число до целого

        List<Integer> doubles1 = doubles.map(aDouble -> Math.toIntExact(Math.round(aDouble)))
                .peek(System.out::println).toList();

        System.out.println();

//        Ќа основании этого потока сгенерировать новый поток данных целых чисел из
//        случайных чисел с границами от 0 до числа из иходного потока данных
        Random random = new Random();
        List<Integer> newDoubles = doubles1.stream()
                .map(num -> random.nextInt(0, num)).peek(System.out::println).toList();

        System.out.println();

        // ”брать дубликаты значений

        List<Integer> newDoubles1 = newDoubles.stream().distinct().peek(System.out::println).toList();
        System.out.println();

//        «аменить каждое число в получившемс€ потоке данных новым потоком состо€щим из обьектов Bubble в
//        количестве равному замен€емому числу,создава€ обьекты с обьемом равным числу из исходного потока и
//        именем по маске "Bubble vol-" + i, где i - число из исходного потока

        List<List<Bubble>> bubbleList = newDoubles1.stream().map(bubble -> {
            List <Bubble> bubbles = new ArrayList<>();
            for (int i = 0; i < bubble; i++) {
              bubbles.add(new Bubble(bubble, "Bubble vol-" + bubble));
            } return bubbles;
        }).peek(System.out::println).toList();
        System.out.println();

//        ќтпечатать в консоль каждый из обьектов нового потока с новой строки

        bubbleList.forEach(bubbles -> bubbles.forEach(System.out::println));
        System.out.println();

//        Ќайти общий обьем полученного потока пузырьков и отпечатать в консоль

        System.out.println(bubbleList.stream().mapToInt(bubbles ->
                bubbles.stream().mapToInt(bubble -> bubble.getVolume()).sum())
                .sum());
    }
}
