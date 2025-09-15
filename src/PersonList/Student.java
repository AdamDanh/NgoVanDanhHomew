
package Quanlynguoi;
import java.util.Scanner;
import java.util.Date;

public class Student extends Person {
    private String idstudent;

    public Student() {
    }

    public Student(String name, Date birthday, String sex, int id, String idstudent) {
        super(name, birthday, sex, id);
        this.idstudent=idstudent;
    }

    public String getIdstudent() {
        return idstudent;
    }

    public void setIdstudent(String idstudent) {
        this.idstudent = idstudent;
    }
    @Override
    public void input(){
        super.input();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter id student");;
        setIdstudent(scanner.nextLine());
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Id Student ="+ getIdstudent());
    }
    public void training(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Training ? (1-good, 2-quite, 3-Medium, 4-Weak");
        int choise=Integer.parseInt(scanner.nextLine());
        switch(choise){
            case 1:
                System.out.println("Good "); break;
            case 2:
                System.out.println("Quite "); break;
            case 3: 
                System.out.println("Medium "); break;
            case 4:
                System.out.println("Weak "); break;
            default:
                System.out.println("Error ! ");
        }
    }
}
