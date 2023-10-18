package classwork.day6;

public class ObjectContainerRunner {

    public static void main(String[] args) {
        ObjectContainer objectContainer = new ObjectContainer();

        objectContainer.add(2);
        objectContainer.add(10);
        objectContainer.add(58);
        objectContainer.add(78);
        objectContainer.add(55);

        while(!objectContainer.isEmpty()){
            System.out.println(objectContainer.removeLast());
        }
    }


    }
