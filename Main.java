package dal;
public class Main {

    public static void main(String[] args) {
        Library lib = new Library();
        lib.addBook(new Book("suun zam", 2020));
        lib.addBook(new Book("ugluuni nom", 1999));

        for (Book b : lib.shelfFrom(2000)) {
            System.out.println(b);
        }
    }
}
