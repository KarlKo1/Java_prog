package week4;

import java.util.Scanner;

public class Ex79 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics asum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");
        while (true) {
            int number = Integer.parseInt(reader.nextLine());
            if (number == -1) {
                break;
            }

            asum.addNumber(number);

            if (number % 2 == 0) {
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }

        NumberStatistics stats = new NumberStatistics();
        stats.addNumber(3);
        stats.addNumber(5);
        stats.addNumber(1);
        stats.addNumber(2);
        System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + stats.sum());
        System.out.println("average: " + stats.average());
        System.out.println("All sum is: " + asum.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());
    }

    public static class NumberStatistics {
        private int amountOfNumbers;
        private int sum;

        public NumberStatistics() {
            this.amountOfNumbers = 0;
            this.sum = 0;
        }

        public void addNumber(int number) {
            this.amountOfNumbers++;
            this.sum += number;
        }

        public int amountOfNumbers() {
            return this.amountOfNumbers;
        }

        public int sum() {
            return this.sum;
        }

        public double average() {
            if (this.amountOfNumbers == 0) {
                return 0;
            }
            return 1.0 * this.sum / this.amountOfNumbers;
        }
    }
}

