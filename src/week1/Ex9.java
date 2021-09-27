package week1;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int x = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int y = Integer.parseInt(reader.nextLine());

        int division = x / y;

        System.out.println("Division: " + x + " / " + y + " = " + division);

    }
}