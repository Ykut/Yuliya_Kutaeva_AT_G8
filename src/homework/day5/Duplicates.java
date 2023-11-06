package homework.day5;

public class Duplicates {
    //public void printDuplicates(){
    public static void printWords(String str) {
        String[] words = str.split(" ");
        String[] duplicate = new String[words.length];
        String compareStr = " ";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(compareStr))
                duplicate[i] = compareStr;
            compareStr = words[i];
        }

    }
}
