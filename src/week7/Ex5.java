package week7;

import java.util.HashMap;

public class Ex5 {
    public static void main(String[] args) {
        HashMap<String, String> nickNames = new HashMap<>();
        nickNames.put("matii", "mage");
        nickNames.put("mikael", "mixu");
        nickNames.put("arto", "arppa");
        System.out.println(nickNames.get("mikael"));
    }
}
