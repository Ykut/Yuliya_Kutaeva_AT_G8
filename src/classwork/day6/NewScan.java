package classwork.day6;

import java.util.Scanner;

public class NewScan {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);

        while (newScan.hasNext()){
            String incoming = newScan.nextLine();
            System.out.printf("Just got '%s' text!", incoming);

            if (incoming.equalsIgnoreCase("limit"))
                return;
        }

    }
}
