package Book;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList;

    public BookList() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean updateBookById(String id) {
        for (Book b : bookList) {
            if (b.updateBookById(id)) {
                return true;
            }
        }
        return false;
    }

    public boolean deleteBookById(String id) {
        return bookList.removeIf(b -> b.getId().equals(id));
    }

    public Book findBookById(String id) {
        for (Book b : bookList) {
            if (b.getId().equals(id)) {
                return b;
            }
        }
        return null;
    }

    public void displayAllBooks() {
        for (Book b : bookList) {
            b.displayDetails();
        }
    }

    public Book findMostExpensiveBook() {
        if (bookList.isEmpty()) {
            return null;
        }
        Book maxBook = bookList.get(0);
        for (Book b : bookList) {
            if (b.calculatePrice() > maxBook.calculatePrice()) {
                maxBook = b;
            }
        }
        return maxBook;
    }

    public void countBooks() {
        int textCount = 0, refCount = 0;
        for (Book b : bookList) {
            if (b instanceof TextBook) {
                textCount++;
            } else if (b instanceof ReferenceBook) {
                refCount++;
            }
        }
        System.out.println("Total TextBooks: " + textCount);
        System.out.println("Total ReferenceBooks: " + refCount);
    }
}
