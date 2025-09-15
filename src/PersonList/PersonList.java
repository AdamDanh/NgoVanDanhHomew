package Quanlynguoi;

import java.util.Scanner;
import java.util.ArrayList;

public class PersonList {

    ArrayList<Person> personlist = new ArrayList<>();

    public void addPerson(Person person) {
        person.input();
        personlist.add(person);
        System.out.println("add success");
    }

    public void outputlist() {
        if (personlist.size() == 0) {
            System.out.println("Empty list");
        } else {
            for (int i = 0; i < personlist.size(); i++) {
                personlist.get(i).output();
            }
        }
    }

    public void deleteperson(int id) {
        for (Person p : personlist) {
            if (p.getId() == id) {
                personlist.remove(p);
                System.out.println("Delete successfull ! ");
                return;
            }
        }
    }
    public void updatePerson(int idCard) {
        for (Person p : personlist) {
            if (p.getId() == idCard) {
                System.out.println("Enter new information for this person:");
                p.input();
                System.out.println("Update successful!");
                return;
            }
        }
}
     public void searchByName(String name) {
        boolean found = false;
        for (Person p : personlist) {
            if (p.getName().toLowerCase().contains(name.toLowerCase())) {
                p.output();
                System.out.println("---------------------------");
                found = true;
            }
        }
        if (!found) {
            System.out.println("No person found with name: " + name);
        }
    }
}
