package week3;

import java.util.ArrayList;

public class Ex64 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(3);

        System.out.println("The average is: " + average(list));
    }

    public static double average(ArrayList<Integer> list) {
        float sum = 0;

        for(int num:list) {
            sum += num;
        }

        float average = (sum / list.size());
        return average;
    }
}