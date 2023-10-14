package homework.day2.basetask;

public class TrainMethodsObjects {
    public void processMouse(Mouse mouse){
        System.out.println(mouse.getName()+" "+mouse.getAge());
        mouse.printMouseDetails();
    }

    public void processSouce(Souce souce){
        System.out.println(souce.getName()+" "+souce.getColor());
        souce.printSouceDetails();
    }

    public void processBee(Bee bee){
        System.out.println(bee.getGender()+" "+bee.getWeight());
        bee.printBeeDetails();
    }
}

