package week6;

public class Ex97 {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        int j = array.length;
        for (int i = 0; i < j - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print(array[j - 1]);
    }
}