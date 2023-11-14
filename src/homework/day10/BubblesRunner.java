package homework.day10;

import homework.day8.objects.Bubble;

import java.util.Arrays;
import java.util.List;

public class BubblesRunner {
    public static void main(String[] args) {

        //Создать список пузырей (класса Bubble) bubbles из 3 пузырьков с обьемами
        // (2, 4, 5) и именами (CO2, O2, CO) соответственно, через (Arrays.asList())

        List<Bubble> bubbles = Arrays
                .asList(new Bubble(2, "CO2"), new Bubble(4, "O2"), new Bubble(5, "CO"));

//        В потоке данных отфильтровать только те пузыри, обьем которых больше 3

        List<Bubble> bubbles1 = bubbles.stream().filter(bub -> (bub.getVolume() > 3)).toList();
        bubbles1.forEach(System.out::println);

        System.out.println();

//        Отсортировать данные по имени в восходящем порядке

        List<Bubble> bubbles2 = bubbles.stream()
                .sorted((bub1, bub2) -> (bub1.getName().compareTo(bub2.getName()))).toList();
        bubbles2.forEach(System.out::println);

        System.out.println();

//        На основании существующего потока данных создать новый, в котором каждый новый Bubble имеет обьем в 3 раза больше исходного

        List<Bubble> newBubbles = bubbles.stream()
                .map(bubble -> {
                    bubble.setVolume(bubble.getVolume() * 3);
                    return bubble;
                }).toList();
        newBubbles.stream().forEachOrdered(System.out::println);

        System.out.println();

//        Вычислить сумму конечного обьема всех пузырей и отпечатать в консоль

        System.out.println(newBubbles.stream()
                .map(bubble -> bubble.getVolume()).reduce((vol1, vol2)->vol1+vol2).get());




    }
}
