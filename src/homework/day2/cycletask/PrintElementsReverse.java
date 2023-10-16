package homework.day2.cycletask;

public class PrintElementsReverse {
    public void printElementsRev (int[]mass){

        for (int i=0; i < mass.length; i++){
            System.out.print(mass[mass.length-i-1]);
        }
        System.out.println();
    }

}
