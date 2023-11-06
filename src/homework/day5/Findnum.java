package homework.day5;

public class Findnum {
    public static void findNumbers(String str) {
        String[] chars = str.split("");
        int[] numbers = new int[chars.length];
        for (String ch : chars) {
            if (ch.matches("[0-9]"))
                numbers[numbers.length] = Integer.parseInt(ch);
        }

        for (int num: numbers) {
            System.out.println(num);
        }


    }
}
