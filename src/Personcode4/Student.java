package Personcode4;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Student extends Person {

    private double gpa;
    private double tuitionfee;

    public Student() {
    }

    public Student(double gpa, double tuitionfee) {
        this.gpa = gpa;
        this.tuitionfee = tuitionfee;
    }

    public Student(double gpa, double tuitionfee, String id, String name, Date dateofbirth) {
        super(id, name, dateofbirth);
        this.gpa = gpa;
        this.tuitionfee = tuitionfee;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getTuitionfee() {
        return tuitionfee;
    }

    public void setTuitionfee(double tuitionfee) {
        this.tuitionfee = tuitionfee;
    }

    @Override
    public void addperson() {
        super.addperson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        setGpa(sc.nextDouble());
        System.out.print("Enter tuition fee: ");
        setTuitionfee(sc.nextDouble());
    }

    @Override
    public boolean updateperson() {
        super.updateperson();
        Scanner sc = new Scanner(System.in);
        System.out.println("Current GPA: " + getGpa());
        System.out.print("New GPA: ");
        setGpa(sc.nextDouble());

        System.out.println("Current tuition fee: " + getTuitionfee());
        System.out.print("New tuition fee: ");
        setTuitionfee(sc.nextDouble());
        return true;
    }

    @Override
    public void displaydetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Student Info:");
        System.out.println("Id: " + getId()
                + ", Name: " + getName()
                + ", Date of birth: " + (getDateofbirth() != null ? sdf.format(getDateofbirth()) : "N/A")
                + ", GPA: " + getGpa()
                + ", Tuition Fee: " + getTuitionfee());
    }

    public double calculateincome() {
        // ví dụ: nếu GPA > 3.5 thì giảm học phí 50%
        if (gpa > 3.5) {
            return tuitionfee * 0.5;
        } else {
            return tuitionfee;
        }
    }
}
