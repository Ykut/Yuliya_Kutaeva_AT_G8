package homework.day4.playground.essence.creatures;

import homework.day4.playground.essence.Flyable;

public class Mosquito extends Insect implements Flyable {
    public Mosquito(int mass, String name) {
        super(mass, name);
    }

    @Override
    public void fly(String direction) {
            System.out.println("I am " + this.getClass() + ", my name is " + this.getClass().getName() + " and I amd flying to " + direction);
    }
}
