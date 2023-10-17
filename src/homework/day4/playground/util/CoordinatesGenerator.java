package homework.day4.playground.util;

import java.util.Random;

public class CoordinatesGenerator {
    public  static int generateCoordinate(){
        Random random = new Random();
        int randomNum = random.nextInt(1,80);
        System.out.println("CoordinatesGenerator: I have generated point with value: "+randomNum);
        return randomNum;
    }
}
