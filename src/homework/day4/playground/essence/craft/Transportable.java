package homework.day4.playground.essence.craft;

public interface Transportable {
    default int move(int pointA, int pointB){
        System.out. println("I am "+this.getClass()+", my name is "+this.getName()+" and I am moving from point "+pointA+" to point "+pointB);
        return pointB - pointA;
}
