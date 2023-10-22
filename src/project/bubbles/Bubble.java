package project.bubbles;

public class Bubble {

    double volumeBubble = 0.3;
    String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    void cramp (){
        System.out.println("Cramp!");
    }

    public double getVolume (){
        return volumeBubble;
    }
}
