package Quanlynguoi;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Person {

    private String name;
    private Date birthday;
    private String sex;
    private int id;

    public Person() {
    }

    public Person(String name, Date birthday, String sex, int id) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void input() {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter information: ");
            System.out.println("Enter name: ");
            setName(scanner.nextLine());
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
            System.out.println("Enter birthday(dd/MM/YYYY): ");
            String birthdayString = scanner.nextLine();
            setBirthday(sdf.parse(birthdayString));
            System.out.println("Enter sex: ");
            setSex(scanner.nextLine());
            System.out.println("Enter id: ");
            setId(Integer.parseInt(scanner.nextLine()));
        } catch (ParseException ex) {
            System.out.println("Error ! " + ex.getMessage());
        }
    }

    public void output() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println("Name =" + getName()
                + "Birthday =" + sdf.format(getBirthday())
                + "Sex =" + getSex()
                + "Id =" + getId());
    }
}
