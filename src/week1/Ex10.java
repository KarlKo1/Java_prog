package week1;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double pi = 3.14;
        double circumference = 2 * pi * radius;

        System.out.println("Circumference of circle is: " + circumference);
    }
}