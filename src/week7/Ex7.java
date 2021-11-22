package week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        System.out.println(dictionary.amountOfWords());

        dictionary.add("cembalo", "harpsichord");
        System.out.println(dictionary.amountOfWords());


        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }

        HashMap<String, String> wordPairs = new HashMap<String, String>();
        wordPairs.put("monkey", "animal");
        wordPairs.put("South", "compass point");
        wordPairs.put("sauerkraut", "food");

        for ( String key : wordPairs.keySet() ) {
            System.out.print( key + " " );
        }

        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        Dictionary.TextUserInterface ui = new Dictionary.TextUserInterface(reader, dict);
        ui.start();
    }

    public static class Dictionary {
        private HashMap<String, String> dictionary = new HashMap<String, String>();

        private String word;
        private String translation;

        public String translate(String word) {
            String translatedWord = dictionary.get(word);

            return translatedWord;
        }

        public void add(String word, String translation) {
            this.word = word;
            this.translation = translation;

            this.dictionary.put(word, translation);
        }

        public int amountOfWords() {
            return this.dictionary.size();
        }

        public ArrayList<String> translationList() {
            ArrayList<String> dictionaryList = new ArrayList<String>();

            for (String i : this.dictionary.keySet()) {
                dictionaryList.add(i + " = " + this.dictionary.get(i));
            }

            return dictionaryList;
        }
        public static class TextUserInterface {
            private Scanner reader;
            private Dictionary dict;

            public TextUserInterface(Scanner reader, Dictionary dictionary){
                this.reader = reader;
                this.dict = dictionary;
            }

            public void start(){
                while(true){
                    System.out.println("Statement: \n");
                    System.out.println("    quit - quit the text user interface");

                    String input = this.reader.nextLine();

                    if(input.equals("quit")){
                        System.out.println("Cheers!");
                        break;
                    } else {

                        if(input.equals("add")){
                            System.out.println("In Finnish: ");
                            String word = this.reader.nextLine();
                            System.out.println("Translation: ");
                            String transl = this.reader.nextLine();

                            this.dict.add(word, transl);
                        }

                        if(input.equals("translate")){
                            System.out.println("Give a word: ");
                            System.out.println("Translation: " + this.dict.translate(this.reader.nextLine()));
                        }


                        System.out.println("Unknown statement\n");
                    }


                }
            }

        }
    }
}
