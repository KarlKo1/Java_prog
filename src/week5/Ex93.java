package week5;

import java.util.Calendar;

public class Ex93 {
    public static void main(String[] args) {
        Person pekka = new Person("Pekka", 15, 2, 1993);
        Person steve = new Person("Thomas", 1, 3, 1955);
        Person martin = new Person("Martin", 1, 3, 1983);

        System.out.println(steve.getName() + " age " + steve.age() + " years");
        System.out.println(pekka.getName() + " age " + pekka.age() + " years");

        System.out.println(martin.getName() + " is older than " + pekka.getName() + ": " + martin.olderThan(pekka));
        System.out.println(pekka.getName() + " is older than " + martin.getName() + ": " + pekka.olderThan(martin));
    }

    public static class Person {
        private String name;
        private MyDate birthday;

        public Person(String name, int day, int month, int year) {
            this.name = name;
            this.birthday = new MyDate(day, month, year);
        }

        public int age() {
            int currentDate = Calendar.getInstance().get(Calendar.DATE);
            int currentMonth = Calendar.getInstance().get(Calendar.MONTH) + 1;
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            MyDate dateNow = new MyDate(currentDate, currentMonth, currentYear);
            int age = dateNow.differenceInYears(birthday);
            return age;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return this.name + ", born " + this.birthday;
        }

        public boolean olderThan(Person compared) {
            return age() > compared.age();
        }
    }

    public static class MyDate {
        private int day;
        private int month;
        private int year;

        public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        public String toString() {
            return this.day + "." + this.month + "." + this.year;
        }

        public int differenceInYears(MyDate compared) {
            int totalDays1 = this.day + (this.month * 30) + (this.year * 365);
            int totalDays2 = compared.day + (compared.month * 30) + (compared.year * 365);

            int daysDifferent = 0;
            if (totalDays1 == totalDays2) {
                return 0;
            } else if (totalDays1 > totalDays2) {
                daysDifferent = totalDays1 - totalDays2;
            } else {
                daysDifferent = totalDays2 - totalDays1;
            }


            return (int) daysDifferent / 365;
        }
    }

}