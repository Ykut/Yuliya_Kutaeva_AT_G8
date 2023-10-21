package homework.day4.playground.essence.craft;

public interface Transportable {
    default int move (int pointA, int pointB) {
        System.out.println("I am "+getClass().getSimpleName()+ ", my name is "+getClass()+" and I am moving from point " + pointA + " to point " + pointB);
        return pointB - pointA;
    }
}
