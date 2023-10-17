package homework.day4.playground.essence;

public interface Flyable {
    default void fly(String direction){
        System.out.println("I am " + this.getClass() + ", my name is " + this.getName() + " and I amd flying to " + direction);
    }

}
