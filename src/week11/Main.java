package week11;

public class Main {
    public static void main(String[] args) {

        /*MindfulDictionary dict = new MindfulDictionary();
         dict.add("apina", "monkey");
         dict.add("banaani", "banana");
         dict.add("apina", "apfe");
         System.out.println(dict.translate("apina"));
         System.out.println(dict.translate("monkey"));
         System.out.println(dict.translate("programming"));
         System.out.println(dict.translate("banana"));*/

        /*MindfulDictionary dict = new MindfulDictionary();
         dict.add("apina", "monkey");
         dict.add("banaani", "banana");
         dict.add("ohjelmointi", "programming");
         dict.remove("apina");
         dict.remove("banana");
         System.out.println(dict.translate("apina"));
         System.out.println(dict.translate("monkey"));
         System.out.println(dict.translate("banana"));
         System.out.println(dict.translate("banaani"));
         System.out.println(dict.translate("ohjelmointi"));*/

        MindfulDictionary dict = new MindfulDictionary("C:/Users/Karl-August/Downloads/Java_prog-master/Java_prog-master/src/week11/words.txt");
        dict.load();

        /*System.out.println(dict.translate("apina"));
        System.out.println(dict.translate("ohjelmointi"));
        System.out.println(dict.translate("alla oleva"));*/

        dict.add("tietokone", "computer");
        System.out.println(dict.translate("tietokone"));
        System.out.println(dict.translate("computer"));
        dict.save();
    }
}
