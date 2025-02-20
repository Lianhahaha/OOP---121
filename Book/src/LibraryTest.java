
import book.Book;

/**
 *
 * @author CRUZ_CPE121
 */
public class LibraryTest {
    public static void main(String[] args) {
        
        Library library = new Library();

        
        Book book1 = new Book("1984", "George Orwell", 5);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 3);
        library.addBook(book1);
        library.addBook(book2);

    
        System.out.println("Before update:");
        library.displayLibrary();

        
        library.updateBookTitle(book1, "Nineteen Eighty-Four");

        
        System.out.println("\nAfter updating book title:");
        library.displayLibrary();

        
        int originalNumber = 123;
        System.out.println("\nOriginal number before method call: " + originalNumber);
        library.attemptPrimitiveChange(originalNumber);
        System.out.println("Original number after method call: " + originalNumber);
    }
}
