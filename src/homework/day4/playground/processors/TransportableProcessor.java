package homework.day4.playground.processors;

import homework.day4.playground.essence.craft.Transportable;
import static homework.day4.playground.util.CoordinatesGenerator.generateCoordinate;

public class TransportableProcessor {
    public void runTransportable(Transportable transportable, int pointA, int pointB){
        transportable.move(pointA, pointB);
        System.out.println("Transportable "+pointA+" was moved to "+pointB+" points");
    }
    public void runTransportable(Transportable transportable){
        int distance=transportable.move(generateCoordinate(), generateCoordinate());
        System.out.println("Transportable "+transportable.getClass()+" was moved to "+distance+" points");
    }
}
