package classwork.day6;

public class ObjectContainer {
    Object[] massive = new Object[10];

    int count = 0;

    public void add(Object incoming) {
        if (count < massive.length) {
            massive[count] = incoming;
            count++;
        }
    }

    public Object removeLast() {
        Object toRemove = null;
        if (count > 0) {
            toRemove = massive[count-1];
            count--;
        }
        return toRemove;
    }

    public boolean isEmpty() {
         return count==0;
        }

}
