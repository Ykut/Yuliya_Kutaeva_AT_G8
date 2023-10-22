package project.runners;

import project.containers.Bottle;

public class Factory {
    public static void main(String[] args) {
        Bottle bottle1 = new Bottle(0.05);
        Bottle bottle2 = new Bottle(0.01);
        Bottle bottle3 = new Bottle (0.2);

        bottle1.warm(12);
        bottle2.warm(18);
        bottle3.warm(25);

        bottle1.getWater();
        bottle2.getWater();
        bottle3.getWater();





    }
}
