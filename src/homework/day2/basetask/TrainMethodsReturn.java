package homework.day2.basetask;

public class TrainMethodsReturn {
    public int returnNewInt(int num){
        return num * 3;
    }

    public long returnNewLong(long longNum){
        return (longNum - 4);
    }

    public char returnNewChar (char someChar){
        return (char) (someChar + someChar); // Здесь не знаю как сделать.как вернуть два символа в строку. Постоянно выводится знак вопроса
    }

    public float returnNewFloat(float newFloat){
        return newFloat/2;
    }

    public double returnNewDouble(double newDouble){
        return newDouble+8;
    }

    public short returnNewShort(short newShort){
        return (short) (newShort-1);
    }

    public byte returnNewByte(byte newByte){
        return (byte) (newByte*2);
    }

    public boolean returnNewBoolean(boolean trueOrFalse){
        return !trueOrFalse;
    }

    public static class TrainMethodsReturnRunner {


        public static void main(String[] args) {
            TrainMethodsReturn trainMethodsRet = new TrainMethodsReturn();
            System.out.println("метод returnNewInt вернул " + trainMethodsRet.returnNewInt(5));
            System.out.println("метод returnNewLong вернул " + trainMethodsRet.returnNewLong(123366L));
            System.out.println("метод returnNewChar вернул " + trainMethodsRet.returnNewChar('F'));
            System.out.println("метод returnNewFloat вернул " + trainMethodsRet.returnNewFloat(0.35666f));
            System.out.println("метод returnNewDouble вернул " + trainMethodsRet.returnNewDouble(0.222));
            System.out.println("метод returnNewShort вернул " + trainMethodsRet.returnNewShort((short) -21112));
            System.out.println("метод returnNewByte вернул " + trainMethodsRet.returnNewByte((byte) 12));
            System.out.println("метод returnNewBoolean вернул " + trainMethodsRet.returnNewBoolean(false));
        }
    }

}
