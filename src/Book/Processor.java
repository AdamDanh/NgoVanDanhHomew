
package Book;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bl = new BookList();
        int choice;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Add new textbook");
            System.out.println("2. Add new reference book");
            System.out.println("3. Update book by id");
            System.out.println("4. Delete book by id");
            System.out.println("5. Find book by id");
            System.out.println("6. Display all books");
            System.out.println("7. Find the most expensive book");
            System.out.println("8. Count TextBooks and ReferenceBooks");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter id: "); String id1 = sc.nextLine();
                    System.out.print("Enter title: "); String title1 = sc.nextLine();
                    System.out.print("Enter base price: "); double bp1 = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter subject: "); String subject = sc.nextLine();
                    bl.addBook(new TextBook(id1, title1, bp1, subject));
                    break;
                case 2:
                    System.out.print("Enter id: "); String id2 = sc.nextLine();
                    System.out.print("Enter title: "); String title2 = sc.nextLine();
                    System.out.print("Enter base price: "); double bp2 = Double.parseDouble(sc.nextLine());
                    System.out.print("Enter publisher: "); String publisher = sc.nextLine();
                    bl.addBook(new ReferenceBook(id2, title2, bp2, publisher));
                    break;
                case 3:
                    System.out.print("Enter id to update: ");
                    String uid = sc.nextLine();
                    if (bl.updateBookById(uid)) System.out.println("Updated!");
                    else System.out.println("Not found!");
                    break;
                case 4:
                    System.out.print("Enter id to delete: ");
                    String did = sc.nextLine();
                    if (bl.deleteBookById(did)) System.out.println("Deleted!");
                    else System.out.println("Not found!");
                    break;
                case 5:
                    System.out.print("Enter id to find: ");
                    String fid = sc.nextLine();
                    Book b = bl.findBookById(fid);
                    if (b != null) b.displayDetails();
                    else System.out.println("Not found!");
                    break;
                case 6:
                    bl.displayAllBooks();
                    break;
                case 7:
                    Book max = bl.findMostExpensiveBook();
                    if (max != null) {
                        System.out.println("Most expensive book:");
                        max.displayDetails();
                    }
                    break;
                case 8:
                    bl.countBooks();
                    break;
            }
        } while (choice != 0);

        System.out.println("Program ended!");
    }
}

