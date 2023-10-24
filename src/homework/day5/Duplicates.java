package homework.day5;

public class Duplicates {
    //public void printDuplicates(){
    public void printWords(String str){
        String [] words = str.split(" ");
        String [] duplicate = new String[0];
        String compareTo="";
        for (String s: words) {
            if(s.equals(compareTo)){
                compareTo=s;
                duplicate [duplicate.length] = compareTo;
            }
            else  compareTo=s;
        }
        for (String s2: duplicate)
            System.out.println(s2);

    }
}
