package Personcode4;

import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;

public abstract class Person {

    private String id;
    private String name;
    private Date dateofbirth;

    public Person() {
    }

    public Person(String id, String name, Date dateofbirth) {
        this.id = id;
        this.name = name;
        this.dateofbirth = dateofbirth;
    }

    // Getter & Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    // Nhập thông tin
    public void addperson() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id: ");
            setId(sc.nextLine());

            System.out.println("Enter name: ");
            setName(sc.nextLine());

            System.out.println("Enter date of birth (dd/MM/yyyy): ");
            String dobStr = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dob = sdf.parse(dobStr);
            setDateofbirth(dob);

        } catch (Exception e) {
            System.out.println("Invalid date format! Please enter as dd/MM/yyyy.");
        }
    }

    // Cập nhật thông tin
    public boolean updateperson() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Current id: " + getId());
            System.out.print("New id: ");
            setId(sc.nextLine());

            System.out.println("Current name: " + getName());
            System.out.print("New name: ");
            setName(sc.nextLine());

            System.out.println("Current date of birth: " + getDateofbirth());
            System.out.print("New date of birth (dd/MM/yyyy): ");
            String dobStr = sc.nextLine();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date dob = sdf.parse(dobStr);
            setDateofbirth(dob);

            return true;
        } catch (Exception e) {
            System.out.println("Invalid date format!");
            return false;
        }
    }

    // Hiển thị thông tin
    public void displaydetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Show information person ");
        System.out.println("Id: " + getId()
                + ", Name: " + getName()
                + ", Date of birth: " + (getDateofbirth() != null ? sdf.format(getDateofbirth()) : "N/A"));
    }

    // Hàm tính số ngày giữa 2 ngày (vd: checkin - checkout)
    public long calculateDays(Date checkinDate, Date checkoutDate) {
        long diffInMillies = checkoutDate.getTime() - checkinDate.getTime();
        return diffInMillies / (1000 * 60 * 60 * 24); // đổi millisecond -> ngày
    }
    public double calculateincome(){
        return 0.0;
    }
}
