package Quanlynguoi;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        PersonList personlist = new PersonList();
        Scanner scanner = new Scanner(System.in);
        int cont; // Bien de lap lai program

        do {
            System.out.println("===== MENU =====");
            System.out.println("0. Exit");
            System.out.println("1. Add Person");
            System.out.println("2. Output list");
            System.out.println("3. Update person");
            System.out.println("4. Delete person");
            System.out.println("5. Search by name");
            System.out.print("Enter your choice: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice) {
                case 0:
                    System.out.println("Exiting program...");
                    return; // thoát hẳn
                case 1:
                    System.out.println("Enter 1 or 2 ? (1-Student / 2-Teacher): ");
                    int type = Integer.parseInt(scanner.nextLine());
                    if(type == 1){
                        personlist.addPerson(new Student());
                    } else if(type == 2){
                        personlist.addPerson(new Teacher());
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;
                case 2:
                    personlist.outputlist();
                    break;
                case 3:
                    System.out.println("Enter id to update person: ");
                    int idUpdate = Integer.parseInt(scanner.nextLine());
                    personlist.updatePerson(idUpdate);
                    break;
                case 4:
                    System.out.println("Enter id to delete person: ");
                    int idDelete = Integer.parseInt(scanner.nextLine());
                    personlist.deleteperson(idDelete);
                    break;
                case 5:
                    System.out.print("Enter name to search: ");
                    String name = scanner.nextLine();
                    personlist.searchByName(name);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("Continue? 1-Yes, 0-No: ");
            cont = Integer.parseInt(scanner.nextLine());

        } while (cont == 1);

        System.out.println("Program ended!");
    }
}
