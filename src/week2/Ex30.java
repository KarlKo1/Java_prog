package week2;

import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Up to what number? ");
        int x = Integer.parseInt(reader.nextLine());

        int y = 1;
        while (x >= y) {
            System.out.println(y);
            y ++;
        }
    }
}