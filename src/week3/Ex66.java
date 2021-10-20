package week3;

import java.util.ArrayList;
import java.util.Collections;

public class Ex66 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The greatest number is: " + greatest(list));
    }

    public static int greatest(ArrayList<Integer> list) {
        int greatestNumber = Collections.max(list);
        return greatestNumber;
    }
}