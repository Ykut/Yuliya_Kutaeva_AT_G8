package homework.day4.playground.util;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance(){
        Random random = new Random();
        int randomNum = random.nextInt(1,100);
        System.out.printf("DistanceGenerator: I have generated distance with value: %d%n", randomNum);
        return randomNum;

    }
}
