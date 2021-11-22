package week5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        Student pekka = new Student("Pekka Mikkola", "013141590");
        System.out.println("name: " + pekka.getName());
        System.out.println("studentnumber: " + pekka.getStudentNumber());
        System.out.println(pekka);
    }

    public static class Student {
        private String name;
        private String studentNumber;

        public Student(String name, String studentNumber) {
            this.name = name;
            this.studentNumber = studentNumber;
        }

        public String getName() {
            return this.name;
        }

        public String getStudentNumber() {
            return this.studentNumber;
        }

        public String toString() {
            return this.name + " (" + this.studentNumber + ") ";
        }
    }
}