package homework.day4.playground.processors;

import homework.day4.playground.essence.Flyable;

import static homework.day4.playground.util.DirectionGenerator.generateDirection;

public class FlyableProcessor {
    public void runFlyable(Flyable flyable){
        flyable.fly(generateDirection());
    }
    public void runFlyable (Flyable flyable, String direction){
        flyable.fly(direction);
    }
}
