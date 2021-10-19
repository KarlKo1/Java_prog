package week3;

import java.util.ArrayList;

public class Ex61 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        System.out.println("There are this many items on the list:");
        System.out.println(countItems(list));

    }

    public static int countItems(ArrayList<String> list) {
        return list.size();
    }
}