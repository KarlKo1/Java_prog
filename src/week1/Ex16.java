package week1;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());

        if(x % 2 == 0) {
            System.out.println("The number " + x + " is even.");
        } else {
            System.out.println("The number " + x + " is odd.");
        }
    }
}