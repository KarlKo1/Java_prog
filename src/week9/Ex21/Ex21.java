package week9.Ex21;

import java.io.File;
import java.util.Scanner;

class Printer {
    private final File file;

    public static void main(String[] args) throws Exception {
        Printer printer = new Printer("src/week9/Ex21/textfile.txt");

        printer.printLinesWhichContain("Väinämöinen");
        System.out.println("-----");
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println("-----");
        printer.printLinesWhichContain("");
        System.out.println("-----");
    }


    public Printer(String fileName) {
        this.file = new File(fileName);
    }

    public void printLinesWhichContain(String word) throws Exception {
        Scanner reader = new Scanner(this.file);

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
    }
}