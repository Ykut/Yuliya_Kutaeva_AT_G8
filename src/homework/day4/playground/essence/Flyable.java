package homework.day4.playground.essence;

public interface Flyable {
    default void fly(String direction){
        System.out.println("I am " + getClass().getSimpleName() + ", my name is " + getClass() + " and I amd flying to " + direction);
    }
}