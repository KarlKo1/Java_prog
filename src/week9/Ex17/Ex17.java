package week9.Ex17;

import week9.Ex17.UI.TextUserInterface;
import week9.Ex17.UI.UserInterface;

public class Ex17 {
    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}