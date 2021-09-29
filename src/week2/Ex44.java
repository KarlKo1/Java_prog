package week2;

public class Ex44 {
    public static void main(String[] args) {
        int answer = least(2, 7);
        System.out.println("Least: " + answer);
    }

    public static int least(int x, int y) {
        return Math.min(x, y);
    }

}