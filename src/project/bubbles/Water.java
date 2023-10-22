package project.bubbles;

public  class Water {
    private String colorOfWater="no";
    private String transparencyOfWater="transparent";
    private String smellOfwater = "no";
    private double tempOfwater = 0;

    public Water(String colorOfWater, String transparencyOfWater, String smellOfwater, double tempOfwater) {
        this.colorOfWater = colorOfWater;
        this.transparencyOfWater = transparencyOfWater;
        this.smellOfwater = smellOfwater;
        this.tempOfwater = tempOfwater;
    }

    public String getColorOfWater() {
        return colorOfWater;
    }

    public void setColorOfWater(String colorOfWater) {
        this.colorOfWater = colorOfWater;
    }

    public String getTransparencyOfWater() {
        return transparencyOfWater;
    }

    public void setTransparencyOfWater(String transparencyOfWater) {
        this.transparencyOfWater = transparencyOfWater;
    }

    public String getSmellOfwater() {
        return smellOfwater;
    }

    public void setSmellOfwater(String smellOfwater) {
        this.smellOfwater = smellOfwater;
    }

    public double getTempOfwater() {
        return tempOfwater;
    }

    public void setTempOfwater(double tempOfwater) {
        this.tempOfwater = tempOfwater;
    }
}
