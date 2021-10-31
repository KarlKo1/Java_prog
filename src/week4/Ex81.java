package week4;

import java.util.Random;

public class Ex81 {
    public static void main(String[] args) {
        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
    }
    public static class PasswordRandomizer {
        private int length;

        public PasswordRandomizer(int length) {
            this.length = length;
        }

        public String createPassword() {
            StringBuilder pwd = new StringBuilder();
            Random randomizer = new Random();
            int i = 0;
            while(i < this.length) {
                int number = randomizer.nextInt(26);
                char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(number);
                pwd.append(symbol);
                i++;
            }
            return pwd.toString();
        }
    }

}
