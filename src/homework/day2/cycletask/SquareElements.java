package homework.day2.cycletask;

public class SquareElements {
    public void squareElem(int[] mass){
        for (int i=0; i< mass.length;i++) {
            mass[i] *=mass[i];
            System.out.println(mass[i]);
        }
        System.out.println();
    }
}
