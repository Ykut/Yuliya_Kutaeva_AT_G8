package homework.day2.cycletask;

public class MinElement {
    public void minElement(int[] mass){
        int min=mass[0];

        for (int j : mass) {
            if (min > j)
                min = j;
        }
        System.out.println(min);
        System.out.println();
        }

    }

