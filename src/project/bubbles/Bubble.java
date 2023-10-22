package project.bubbles;

public class Bubble {

    private double volumeBubble = 0.3;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    void cramp (){
        System.out.println("Cramp!");
    }

    public double getVolume() {
        return volumeBubble;
    }
}

