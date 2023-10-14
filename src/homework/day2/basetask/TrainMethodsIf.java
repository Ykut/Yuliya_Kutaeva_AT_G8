package homework.day2.basetask;

public class TrainMethodsIf {
   public int returnNewInt(int num){
       if (num < 8)
           return num*8;
       else
           return num/4;
   }

   public long returnNewLong(long lNum){
       if (lNum > 300)
           return lNum-300;
       else
           return lNum + 20;
   }

   public char returnNewChar(char newChar){  //Не понимаю как это сделать
       if (newChar == 'g')
           return (char) (newChar+'o'); //возвращает знак вопроса. Почему?
       else
           return newChar;
   }

   public float returnNewFloat(float fNum){
       if (fNum == (float) 0.67)
           return fNum;
       else
           return fNum*2;
   }

   public double returnNewDouble(double dNum){
       if ((30<dNum)&&(dNum<80))
           return dNum+87;
       else if (80<dNum && dNum<400)
           return dNum - 87;
       else if (dNum>400)
           return dNum/4;
       else
           return dNum;
   }

   public void returnNewBoolean (boolean boolNew){
       if (boolNew == true)
           System.out.println("Я получил на вход значение истины");
       else
           System.out.println("Я получил на вход ложь");
   }

   public static class TrainMethodsIfRunner {
       public static void main(String[] args) {
           TrainMethodsIf methodsIf = new TrainMethodsIf();
           System.out.println("метод returnNewInt вернул "+methodsIf.returnNewInt(5));
           System.out.println("метод returnNewInt вернул "+methodsIf.returnNewLong(1254L));
           System.out.println("метод returnNewInt вернул "+methodsIf.returnNewChar('g'));
           System.out.println("метод returnNewInt вернул "+methodsIf.returnNewFloat(2.36f));
           System.out.println("метод returnNewInt вернул "+methodsIf.returnNewDouble(500.69));
           methodsIf.returnNewBoolean(false);
       }
   }

}
