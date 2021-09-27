package week2;

import java.util.Scanner;

public class Ex36 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type numbers: ");

        int input;
        int sum = 0;
        int count = 0;
        int even = 0;
        int odd = 0;
        double avg = 0;
        while (true) {
            input = Integer.parseInt(reader.nextLine());
            if (input == -1) {
                break;
            }

            sum += input;
            count ++;
            avg = (double)sum/count;

            if(input%2==0) {
                even ++;
            } else {
                odd ++;
            }
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}