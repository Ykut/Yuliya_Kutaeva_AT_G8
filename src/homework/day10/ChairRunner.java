package homework.day10;

import homework.day8.objects.Bubble;
import homework.day8.objects.Chair;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChairRunner {
    public static void main(String[] args) throws IOException {
        //—оздать поток данных furniture класса Chair (через new Stream.of) furniture из 3 стульев
        //высотой (120, 90, 100, 110) и шириной (40, 30, 50, 45) соответственно

        List<Chair> furniture = Stream.of(
                new Chair(120, 40),
                new Chair(90, 30),
                new Chair(100, 50),
                new Chair(110, 45)
        ).toList();

        //ќтфильтровать только те стуль€, который выше или равны 100 и уже или равны 50

        furniture.stream().filter(chair -> (chair.getHeight() >= 100 && chair.getWidth() <= 50))
                .peek(System.out::println).toList();

        //ќтсортировать по высоте, а если высота равна, то по ширине в нисход€щем пор€дке

        //furniture.stream().sorted((ch1, ch2) -> ch1.getHeight() );

        //Ќа основании существующего потока данных создать новый, в котором каждый новый Chair имеет высоту,
        // деленную на 2, и ширину, умноженную на случайное число от 3 до 8 включительно

        Random random = new Random();

        List<Chair> newFurniture = furniture.stream().peek(chair -> {
            chair.setHeight(chair.getHeight() / 2);
            chair.setWidth(chair.getWidth() * random.nextInt(3, 9));
        }).peek(System.out::println).toList();

        //Ќа основании получившегос€ потока данных создать новый, представл€ющий собой уникальный набо высот стульев
        // умноженных на их ширину

        List<Integer> anotherFurniture = newFurniture.stream()
                .map(chair -> (chair.getWidth()* chair.getHeight())).distinct().peek(System.out::println).toList();

        //Ќайти наибольшее значение в получившемс€ потоке

        int maxElem = anotherFurniture.stream().max(Comparator.naturalOrder()).get();

        //—оздать новый обьект Bubble с обьемом равным найденному наибольшему значению
        // и именем равным найденному наибольшему значению,
        // представленным в виде словесного выражени€ каждой цифры числа этого значени€, указанного чере пробел

        Bubble bubble = new Bubble(maxElem, (
                Arrays.stream(String.valueOf(maxElem).split("")).map(s -> {
                    switch (s) {
                        case "0" -> s = "ноль";
                        case "1" -> s = "один";
                        case "2" -> s = "два";
                        case "3" -> s = "три";
                        case "4" -> s = "четыре";
                        case "5" -> s = "п€ть";
                        case "6" -> s = "шесть";
                        case "7" -> s = "семь";
                        case "8" -> s = "восемь";
                        case "9" -> s = "дев€ть";
                    }
                    return s;
                }).collect(Collectors.joining(" ")))
                );

        //Ќапечатать строковое значение полученного обьекта в текстовый файл

        BufferedWriter out = new BufferedWriter(new FileWriter("Bubble.txt"));

        out.write(bubble.toString());

        out.close();


    }
}
