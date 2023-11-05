package homework.day7.inputAndOutput;

import java.util.Scanner;

public class OutputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){

            String incoming = scanner.nextLine();
            System.out.printf("Hello, I just got '%s' from you!\n", incoming);
        }
    }
}
