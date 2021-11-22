package week6;

import java.util.Random;

public class Ex100 {
    public static void main(String[] args) {
        /*
        NightSky NightSky = new NightSky(0.1, 40, 10);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky = new NightSky(0.2, 15, 6);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
*/
        NightSky NightSky = new NightSky(8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println("");

        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
    }

    public static class NightSky {
        private double density;
        private int width;
        private int height;
        private int starsInLastPrint;

        public NightSky(double density) {
            this.density = density;
            this.width = 20;
            this.height = 10;
        }

        public NightSky(int width, int height) {
            this.width = width;
            this.height = height;
            this.density = 0.1;
        }

        public NightSky(double density, int width, int height) {
            this.density = density;
            this.width = width;
            this.height = height;
        }

        public void printLine() {
            Random random = new Random();

            for (int x = 0; x < this.width; x++) {
                double randomValue = random.nextDouble();

                if (randomValue > this.density) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                    this.starsInLastPrint = this.starsInLastPrint + 1;
                }
            }

            System.out.println("");
        }

        public void print() {
            this.starsInLastPrint = 0;
            for (int i = 0; i < this.height; i++) {
                printLine();
            }
        }

        public int starsInLastPrint() {
            return starsInLastPrint;
        }

    }
}