package homework.day4.playground.essence.creatures;

public class Beetle extends Insect {

    public void nest(Carrot home){
        if (this.getMass() < home.getMass()){
            int numOfMembers=home.getMass()%this.getMass();
            System.out.println("I am " + this.getName() + " and I will nest there with " + numOfMembers + " my family members!");

        } else
            System.out.println("This carrot is too small for nesting :(");
    }
}
