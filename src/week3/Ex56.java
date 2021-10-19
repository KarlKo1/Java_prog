package week3;

import java.util.Scanner;

public class Ex56 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }

    public static String reverse(String text) {
        StringBuilder result = new StringBuilder();
        int i = text.length() - 1;
        while (i >= 0) {
            result.append(text.charAt(i));
            i--;
        }

        return result.toString();
    }

}

