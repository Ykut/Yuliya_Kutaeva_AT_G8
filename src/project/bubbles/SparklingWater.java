package project.bubbles;

public class SparklingWater extends Water{
    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, double temperature) {
        super(color, transparency, smell, temperature);
        this.isOpened();
    }

    private void isOpened() {
    }

    public void pump(Bubble[] bubbles){

    }

    public void setOpened(){
        this.isOpened=true;
        this.degas();
    }

    private void degas() {
    }


}
