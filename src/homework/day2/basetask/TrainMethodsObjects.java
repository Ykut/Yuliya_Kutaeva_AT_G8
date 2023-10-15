package homework.day2.basetask;

public class TrainMethodsObjects {

    public void processMouse(Mouse m){
       System.out.println(m.getName()+" "+m.getAge());
        m.printMouseDetails();
    }

    private void processSouce(Souce souce){
        System.out.println(souce.getName()+" "+souce.getColor());
        souce.printSouceDetails();
    }

    private void processBee(Bee bee){
        System.out.println(bee.getGender()+" "+bee.getWeight());
        bee.printBeeDetails();
    }

    private void processObstacle (Obstacle obstacle){
        System.out.println(obstacle.getDescription()+" "+obstacle.getSeverity());
        obstacle.printObstacleDetails();
    }

    private void processPineapple(Pineapple pineapple) {
        System.out.println(pineapple.getGrade()+" "+pineapple.getHeatCapacity());
        pineapple.printPineappleDetails();
    }

    private static class TrainMethodsObjectsRunner{
        public static void main(String[] args) {
            TrainMethodsObjects trainMethodsObjects=new TrainMethodsObjects();

            Mouse mouse = new Mouse("Mickey", 2);
            trainMethodsObjects.processMouse(mouse);

            Souce souce = new Souce("Ketchup", "Red");
            trainMethodsObjects.processSouce(souce);

            Bee bee = new Bee("Male", 2135);
            trainMethodsObjects.processBee(bee);

            Obstacle obstacle = new Obstacle("Critical", "Ruin everything");
            trainMethodsObjects.processObstacle(obstacle);

            Pineapple pineapple = new Pineapple("Babypine", 562.360);
            trainMethodsObjects.processPineapple(pineapple);
        }
    }
}

