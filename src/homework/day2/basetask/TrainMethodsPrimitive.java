package homework.day2.basetask;

public class TrainMethodsPrimitive {
    public void printInt (int num){
        System.out.println("я получил на вход число "+num);
    }

    public void printLong (long longNum) {
        System.out.println("я получил на вход длинное число "+longNum);
    }

    public void printChar (char someChar){
        System.out.println("я получил на вход символ "+someChar);
    }

    public void printFloat (float floatNum){
        System.out.println("я получил на вход дробное число "+floatNum);
    }

    public void printDouble (double doubleNum){
        System.out.println("я получил на вход длинное дробное число "+doubleNum);
    }
    public void printShort (short shortNum){
        System.out.println("я получил на вход короткое число "+shortNum);
    }

    public void printByte (byte byteNum){
        System.out.println("я получил на вход очень короткое число "+byteNum);
    }

    public void printBoolean(boolean trueOrFalse){
        System.out.println("я получил на вход булево "+trueOrFalse);
    }

    public static class TrainMethodsPrimitiveRunner {
        public static void main(String[] args) {
            TrainMethodsPrimitive trainMethodsPrimitive = new TrainMethodsPrimitive();

            trainMethodsPrimitive.printInt(5);
            trainMethodsPrimitive.printLong(155L);
            trainMethodsPrimitive.printChar('M');
            trainMethodsPrimitive.printFloat(5.99f);
            trainMethodsPrimitive.printDouble(1.23);
            trainMethodsPrimitive.printShort((short) 32365);
            trainMethodsPrimitive.printByte((byte) 100);
            trainMethodsPrimitive.printBoolean(false);
        }
    }

}
