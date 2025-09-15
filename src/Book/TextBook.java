package Book;

public class TextBook extends Book {

    private String subject;

    public TextBook(String id, String title, double basePrice, String subject) {
        super(id, title, basePrice);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void addBook() {
    }

    @Override
    public boolean updateBookById(String id) {
        if (getId().equals(id)) {
            this.subject = this.subject + " (updated)";
            return true;
        }
        return false;
    }

    @Override
    public void displayDetails() {
        System.out.println("TextBook - ID: " + getId()
                + ", Title: " + getTitle()
                + ", Subject: " + subject
                + ", Price: " + calculatePrice());
    }

    @Override
    public double calculatePrice() {
        return getBasePrice() * 1.1;
    }
}
