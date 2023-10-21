package homework.day4.playground.essence.craft;

public interface Rideable {
    default void drive(String direction){
        System.out.println("I am "+this.getClass().getName()+", my name is "+getClass()+" and I amd driving to "+direction);
    }
}
