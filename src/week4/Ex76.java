package week4;

import java.util.ArrayList;

public class Ex76 {
    public static void main(String[] args) {
        Ex76 step = new Ex76();

        step.addMeal("Hamburger");
        step.addMeal("Fish'n'Chips");
        step.addMeal("Sauerkraut");

        step.printMeals();
        System.out.println(' ');

        step.clearMenu();
        step.printMeals();
    }

    private final ArrayList<String> meals;

    public Ex76() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.clear();
    }

}
