package homework.day2.basetask;

public class Souce {
    String name;
    String color;

    public Souce(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printSouceDetails(){
        System.out.println("Это соус "+getName()+" "+getColor()+" цвета");
    }
}
