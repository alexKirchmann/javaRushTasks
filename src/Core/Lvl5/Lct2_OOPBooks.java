package Core.Lvl5;

import java.util.LinkedList;
import java.util.List;

class Lct2_OOPBooks {

    abstract static class Book {
        public static void main(String[] args) {
            List<Book> books = new LinkedList<Book>();
            books.add(new AlanWakeBook("Sudden Stop"));
            books.add(new ThomasZaneBook("Poetry"));
            System.out.println(books);
        }

        private String author;

        Book(String author) {
            this.author = author;
        }

        abstract Book getBook();

        abstract String getTitle();

        private String getOutputByBookType() {
            String alanWakeOutput = author + ": " + getBook().getTitle() + " is a horror-detective";
            String thomasZaneOutput = getBook().getTitle() + " was written by " + author;

            String output = "UNKNOWN";
            if(author.equals("Alan Wake")) output=alanWakeOutput;
            if(author.equals("Thomas Zane")) output=thomasZaneOutput;
            return output;
        }

        public String toString() {
            return getOutputByBookType();
        }
    }



    static class AlanWakeBook extends Book {
        private String title;

        AlanWakeBook (String title) {
            super("Alan Wake");
            this.title = title;
        }

        Book getBook () {
            return this;
        }

        String getTitle () {
            return title;
        }
    }



    static class ThomasZaneBook extends Book {
        private String title;

        ThomasZaneBook (String title) {
            super("Thomas Zane");
            this.title = title;
        }

        Book getBook () {
            return this;
        }

        String getTitle () {
            return title;
        }
    }
}
