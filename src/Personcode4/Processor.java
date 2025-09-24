package Personcode4;

import java.util.Scanner;
import java.util.ArrayList;

public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PersonList list = new PersonList();

        int choice;
        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Update Person by ID");
            System.out.println("4. Delete Person by ID");
            System.out.println("5. Find Person by ID");
            System.out.println("6. Display All");
            System.out.println("7. Find Top 3 Students");
            System.out.println("8. Find Teacher with Highest Income");
            System.out.println("9. Find Students with Scholarships");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1: {
                    Student s = new Student();
                    s.addperson();
                    list.addPerson(s);
                    break;
                }
                case 2: {
                    Teacher t = new Teacher();
                    t.addperson();
                    list.addPerson(t);
                    break;
                }
                case 3: {
                    System.out.print("Enter ID to update: ");
                    String id = sc.nextLine();
                    boolean ok = list.updatePersonById(id);
                    if (!ok) {
                        System.out.println("Not found!");
                    }
                    break;
                }
                case 4: {
                    System.out.print("Enter ID to delete: ");
                    String id = sc.nextLine();
                    boolean ok = list.deletePersonById(id);
                    if (!ok) {
                        System.out.println("Not found!");
                    } else {
                        System.out.println("Deleted!");
                    }
                    break;
                }
                case 5: {
                    System.out.print("Enter ID to find: ");
                    String id = sc.nextLine();
                    Person p = list.findPersonById(id);
                    if (p != null) {
                        p.displaydetails();
                    } else {
                        System.out.println("Not found!");
                    }
                    break;
                }
                case 6: {
                    list.displayAll();
                    break;
                }
                case 7: {
                    ArrayList<Student> top3 = list.findTop3Students();
                    System.out.println("Top 3 Students:");
                    for (Student st : top3) {
                        st.displaydetails();
                    }
                    break;
                }
                case 8: {
                    Teacher best = list.findTeacherWithHighestIncome();
                    if (best != null) {
                        System.out.println("Teacher with highest income:");
                        best.displaydetails();
                        System.out.println("Income: " + best.calculateincome());
                    } else {
                        System.out.println("No teacher found!");
                    }
                    break;
                }
                case 9: {
                    ArrayList<Student> scholarships = list.findStudentsWithScholarships();
                    if (scholarships.isEmpty()) {
                        System.out.println("No students with scholarships!");
                    } else {
                        System.out.println("Students with scholarships:");
                        for (Student st : scholarships) {
                            st.displaydetails();
                        }
                    }
                    break;
                }
                case 0:
                    System.out.println("Exit program.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}
