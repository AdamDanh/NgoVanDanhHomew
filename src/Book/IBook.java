package Book;

public interface IBook {

    void addBook();

    boolean updateBookById(String id);

    void displayDetails();

    double calculatePrice();
}
