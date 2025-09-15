package Book;

public class ReferenceBook extends Book {

    private String publisher;

    public ReferenceBook(String id, String title, double basePrice, String publisher) {
        super(id, title, basePrice);
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public void addBook() {
    }

    @Override
    public boolean updateBookById(String id) {
        if (getId().equals(id)) {
            this.publisher = this.publisher + " (updated)";
            return true;
        }
        return false;
    }

    @Override
    public void displayDetails() {
        System.out.println("ReferenceBook - ID: " + getId()
                + ", Title: " + getTitle()
                + ", Publisher: " + publisher
                + ", Price: " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.2;
    }
}
