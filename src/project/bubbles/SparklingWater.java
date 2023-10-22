package project.bubbles;

public class SparklingWater extends Water{
    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(String colorOfWater, String transparencyOfWater, String smellOfwater, double tempOfwater, boolean isOpened) {
        super(colorOfWater, transparencyOfWater, smellOfwater, tempOfwater);
        this.isOpened = isOpened;
    }

    public void pump (Bubble[] bubbles){

    }

    public void setOpened(){
        this.isOpened=true;
        this.degas();
    }

    private void degas() {
    }

    private void isOpened(){

    }
}
