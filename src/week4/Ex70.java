package week4;

import java.util.ArrayList;

public class Ex70 {
    public static void main(String[] args) {
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();

        first.add(4);
        first.add(3);

        second.add(5);
        second.add(10);
        second.add(7);

        combine(first, second);

        System.out.println(first); // prints [4, 3, 5, 10, 7]

        System.out.println(second); // prints [5, 10, 7]

    }

    private static void combine(ArrayList<Integer> first, ArrayList<Integer> second) {
        first.addAll(second);
    }
}