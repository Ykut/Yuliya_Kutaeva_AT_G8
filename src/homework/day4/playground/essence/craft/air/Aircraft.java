package homework.day4.playground.essence.craft.air;

import homework.day4.playground.essence.Flyable;
import homework.day4.playground.essence.Matter;
import homework.day4.playground.essence.craft.Transportable;

public abstract class Aircraft extends Matter implements Flyable, Transportable {
    protected String name;

    public Aircraft(int mass, String name) {
        super(mass);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void fly(String direction) {
            System.out.println("I am " + this.getClass() + ", my name is " + this.getName() + " and I amd flying to " + direction);
    }

    @Override
    public int move(int pointA, int pointB) {
        System.out.println("I am "+this.getClass()+", my name is "+this.getName()+" and I am moving from point "+pointA+" to point "+pointB);;
        return pointB - pointA;
    }
}
