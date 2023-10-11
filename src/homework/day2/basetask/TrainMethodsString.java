package homework.day2.basetask;

public class TrainMethodsString {
     void printMama () {
        System.out.println("мама мыла раму");
    }

     void printPapa () {
        System.out.println("папа мыла раму");
    }

     void  printString(String fStr) {
        System.out.println(fStr);
    }

     void printMamaString (String sStr) {
        System.out.println("мама мыла " + sStr);
    }

    public static class TrainMethodsStringRunner {

        public static void main(String[] args) {
            TrainMethodsString trainMethodsString = new TrainMethodsString();
            trainMethodsString.printMama ();
            trainMethodsString.printPapa();
            trainMethodsString.printString("мама постоянно что-то моет");
            trainMethodsString.printMamaString("папу");
        }
    }

}
