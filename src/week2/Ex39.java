package week2;

public class Ex39 {
    public static void main(String[] args) {
        System.out.println("39.1");
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("39.2");
        printSquare(4);
        System.out.println("39.3");
        printRectangle(17, 3);
        System.out.println("39.4");
        printTriangle(4);
    }
    // 39.1
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount){
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    // 39.2
    public static void printSquare(int sideSize) {
        int i = 0;
        while (i < sideSize){
            printStars(sideSize);
            i++;
        }
    }

    // 39.3
    public static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height){
            printStars(width);
            i++;
        }
    }

    // 39.4
    public static void printTriangle(int size) {
        int i = 1;
        while (i <= size){
            printStars(i);
            i++;
        }
    }
}