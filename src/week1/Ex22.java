package week1;

import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String password = "carrot";
        String message = "Hello World!";

        while (true) {
            System.out.print("Type the password: ");
            String command = reader.nextLine();

            if (command.equals(password) ) {
                System.out.println("The secret is: " + message);
                break;
            } else {
                System.out.println("Wrong!");
            }

        }
    }
}