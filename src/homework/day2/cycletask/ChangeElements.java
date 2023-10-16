package homework.day2.cycletask;

public class ChangeElements {
    public void changeElements(int[] mass){
        int j = mass[0];
        System.out.println(j);
        mass[0] = mass[mass.length-1];
        mass[mass.length-1] = j;

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}
