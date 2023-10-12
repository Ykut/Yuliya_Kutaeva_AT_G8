package project.bubbles;

public class Bubble {
    double volumeBubble = 0.3;
    String compoundBubble;

    public Bubble(String compoundBubble) {
        this.compoundBubble = compoundBubble;
    }

    void burst (){
        System.out.println("Cramp!");
    }
}
