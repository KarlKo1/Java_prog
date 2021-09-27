package week2;

import java.util.Scanner;

public class Ex32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Until what? ");
        int x = Integer.parseInt(reader.nextLine());
        int y = 0;
        int sum = 0;

        while (y <= x) {
            sum = sum + y;
            y++;
        }
        System.out.println("Sum is " + sum);
    }
}