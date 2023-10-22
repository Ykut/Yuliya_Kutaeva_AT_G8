package project.containers;

import project.bubbles.Bubble;
import project.bubbles.Water;

public class Bottle {
    private double volume;
    private Water water;

    public Bottle(double volume) {
        this.volume = volume;
    }

    public void open(){
        this.water.SetOpened();
    }

    public void warm(int temperature){
        water.setTemperature(temperature);
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public void setBubbles(){
        Bubble[] bubbles=new Bubble[10000];



    }
}
