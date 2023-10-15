package LibraryManagementSystem;

    import java.util.ArrayList;

    public class LibraryManagementSystem {
        public static void main(String[] args) {
            Library library = new Library();

            // Adding books to the library
            Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", Genre.FICTION);
            Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", Genre.FICTION);
            Book book3 = new Book("The Catcher in the Rye", "J.D. Salinger", Genre.FICTION);

            library.addBook(book1);
            library.addBook(book2);
            library.addBook(book3);

            // Fetching and displaying all books in the library
            ArrayList<Book> allBooks = library.getAllBooks();
            System.out.println("All Books in the Library:");
            for (Book book : allBooks) {
                System.out.println(book);
            }

            // Deleting a book from the library
            library.deleteBook(book2);
            System.out.println("\nAfter Deleting a Book:");
            allBooks = library.getAllBooks();
            for (Book book : allBooks) {
                System.out.println(book);
            }
        }
    }


