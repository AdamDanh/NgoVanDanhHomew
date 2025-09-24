
package Personcode4;
import java.util.Scanner;
import java.text.SimpleDateFormat;
public class Teacher extends Person{
    private int numberofclass;
    private double basesalary;

    public Teacher() {
    }

    public Teacher(int numberofclass, double basesalary) {
        this.numberofclass = numberofclass;
        this.basesalary = basesalary;
    }

    public int getNumberofclass() {
        return numberofclass;
    }

    public void setNumberofclass(int numberofclass) {
        this.numberofclass = numberofclass;
    }

    public double getBasesalary() {
        return basesalary;
    }

    public void setBasesalary(double basesalary) {
        this.basesalary = basesalary;
    }
    
    @Override
    public void addperson(){
        super.addperson();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of class: ");
        setNumberofclass(sc.nextInt());
        System.out.println("Enter base Salary: ");
        setBasesalary(sc.nextDouble());
    }
    @Override 
    public boolean updateperson(){
        super.updateperson();
        Scanner sc= new Scanner(System.in);
        System.out.println("Current numberofclass: "+ getNumberofclass());
        System.out.println("New Number of class: ");
        setNumberofclass(sc.nextInt());
        
        System.out.println("Current base Salary: "+ getBasesalary());
        System.out.println("New Base salary: ");
        setBasesalary(sc.nextDouble());
        return true;
    }
    @Override 
    public void displaydetails(){
        SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Teacher info: ");
        System.out.println("Id: "+ getId()+
                ", Name: "+ getName()+
                ", Date of birth: "+ getDateofbirth()+
                ", Numberofclass: "+ getNumberofclass()+
                ", Base salary: "+ getBasesalary());
    }
    @Override 
    public double calculateincome(){
        return numberofclass*basesalary;
        
    }

}
