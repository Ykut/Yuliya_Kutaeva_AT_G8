package homework.day4.playground.util;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        String direction = "";
        Random random = new Random();
        int randomNum = random.nextInt(1,40);
        if (1<=randomNum && randomNum<=9)
            direction = "NORTH";
        if (10<=randomNum && randomNum<=19)
            direction = "SOUTH";
        if (20<=randomNum && randomNum<=29)
            direction = "WEST";
        if (30<=randomNum && randomNum<=39)
            direction = "EAST";
        
        return direction;
    }
}
