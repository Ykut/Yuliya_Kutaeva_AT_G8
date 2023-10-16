package homework.day2.cycletask;

public class MultipleElements {
    public void multipleElem(int[] mass){
        for (int i=0; i< mass.length;i++) {
            mass[i] = mass[i]*5;
            System.out.println(mass[i]);
        }
        System.out.println();
    }

}
