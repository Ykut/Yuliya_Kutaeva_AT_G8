package project.containers;

import project.bubbles.Water;

public class Bottle {
    private double volume;
    Water water;

    public Bottle(double volume) {
        this.volume = volume;
    }

    public void open(){

    }

    public void warm(int temperature){
        water.setTempOfwater(temperature);
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void setBubbles(){

    }
}
