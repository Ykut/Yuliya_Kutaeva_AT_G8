package homework.day4.playground.essence.creatures;

import homework.day4.playground.essence.Flyable;

public class Fly extends Insect implements Flyable {

    public Fly(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
        System.out.println("I am " + super.getClass() + ", my name is " + super.getClass().getName() + " and I amd flying to " + direction);

    }
}
