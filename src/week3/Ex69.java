package week3;

import java.util.Scanner;

public class Ex69 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }

    public static boolean palindrome(String text) {
        boolean isPalindrome = text.equals(reverse(text));
        return isPalindrome;
    }

        public static String reverse(String text) {
            StringBuilder reversed = new StringBuilder();
            int i = 0;
            while (i < text.length()) {
                char c = text.charAt(i);
                reversed.insert(0, c);
                i++;
            }
            return reversed.toString();
        }
}