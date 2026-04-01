package dal;
import java.util.*;
class Book {
    String title;
    int year;
    Book(String title, int year) {
        this.title = title;
        this.year = year;
    }
    @Override
    public String toString() {
        return title + ": " + year;
    }
}

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book b) { books.add(b); }

    class BookShelf implements Iterable<Book> {
        private int minYear;
        BookShelf(int minYear) { this.minYear = minYear; }

        @Override
        public Iterator<Book> iterator() {
            return books.stream()
                        .filter(b -> b.year >= minYear)
                        .iterator();
        }
    }

    public BookShelf shelfFrom(int year) {
        return new BookShelf(year);
    }
}
