package homework.day4.playground.essence.creatures;

public abstract class Vertebrata extends Animal{

    public Vertebrata(int mass, String name) {
        super(mass, name);
    }

    public void eat (Insect food) {
       System.out.println("I am " + this.getName()+" and I am eating "+ food.getName());
    }
}
