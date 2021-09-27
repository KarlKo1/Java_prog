package week2;

import java.util.Random;
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int draw = drawNumber();
        int guesses = 0;
        while (true) {
            System.out.print("Guess a number: ");
            int guess = Integer.parseInt(reader.nextLine());
            guesses++;
            if (guess == draw) {
                break;
            } else if (guess < draw) {
                System.out.println("The number is greater, guesses made: " + guesses);
            } else {
                System.out.println("The number is lesser, guesses made: " + guesses);
            }
        }
        System.out.println("Congratulations, your guess is correct!");
    }

    private static int drawNumber() {
        return new Random().nextInt(100);
    }
}