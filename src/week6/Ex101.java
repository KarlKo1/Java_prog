package week6;

import java.util.ArrayList;

public class Ex101 {
    public static void main(String[] args) {
        Book cheese = new Book("Cheese Problems Solved", "Woodhead Publishing", 2007);
        System.out.println(cheese.title());
        System.out.println(cheese.publisher());
        System.out.println(cheese.year());
        System.out.println(cheese);

        Library Library = new Library();
        Library.addBook(cheese);
        Book nhl = new Book("NHL Hockey", "Stanley Kupp", 1952);
        Library.addBook(nhl);
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));
        Library.printBooks();


        Library.addBook(new Book("Cheese Problems Solved", "Woodhead Publishing", 2007));
        Library.addBook(new Book("The Stinky Cheese Man and Other Fairly Stupid Tales", "Penguin Group", 1992));
        Library.addBook(new Book("NHL Hockey", "Stanley Kupp", 1952));
        Library.addBook(new Book("Battle Axes", "Tom A. Hawk", 1851));

        ArrayList<Book> result = Library.searchByTitle("Cheese");
        for (Book book : result) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book : Library.searchByPublisher("Penguin Group  ")) {
            System.out.println(book);
        }

        System.out.println("---");
        for (Book book : Library.searchByYear(1851)) {
            System.out.println(book);
        }
    }

    public static class Book {
        private String title;
        private String publisher;
        private int year;


        public Book(String title, String publisher, int year) {
            this.title = title;
            this.publisher = publisher;
            this.year = year;
        }

        public String title() {
            return title;
        }

        public String publisher() {
            return publisher;
        }

        public int year() {
            return year;
        }

        public String toString() {
            return this.title + ", " + this.publisher + ", " + this.year;
        }
    }

    public static class Library {
        private ArrayList<Book> Library;

        public Library() {
            this.Library = new ArrayList<Book>();
        }

        public void addBook(Book newBook) {
            this.Library.add(newBook);
        }

        public void printBooks() {
            for (Book book : this.Library) {
                System.out.println(book);
            }
        }

        public ArrayList<Book> searchByTitle(String title) {
            return searchBook(title, null, -1);
        }

        public ArrayList<Book> searchByPublisher(String publisher) {
            return searchBook(null, publisher, -1);
        }

        public ArrayList<Book> searchByYear(int year) {
            return searchBook(null, null, year);
        }

        public ArrayList<Book> searchBook(String title, String bookName, int year) {
            ArrayList<Book> found = new ArrayList<Book>();
            for (Book book : this.Library) {
                if (StringUtils.included(book.title(), title)
                        || StringUtils.included(book.publisher(), bookName)
                        || book.year() == year) {
                    found.add(book);
                }
            }

            return found;
        }
    }

    public class StringUtils {
        public static boolean included(String word, String searched) {
            if (word != null && searched != null) {
                if (word.toUpperCase().contains(searched.trim().toUpperCase())) {
                    return true;
                } else {
                    return false;
                }

            } else {
                return false;
            }
        }
    }
}