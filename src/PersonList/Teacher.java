
package Quanlynguoi;
import java.util.Scanner;
import java.util.Date;

public class Teacher extends Person{
    private String idteacher;

    public Teacher() {
    }

    public Teacher(String name, Date birthday, String sex, int id) {
        super(name, birthday, sex, id);
    }

    public String getIdteacher() {
        return idteacher;
    }

    public void setIdteacher(String idteacher) {
        this.idteacher = idteacher;
    }

    @Override 
    public void input(){
        super.input();
        this.idteacher=idteacher;
    }
    @Override
    public void output(){
        super.output();
        System.out.println("Id teacher ="+ idteacher);
    }
public void rating(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Rating (1-Good, 2-Quite, 3-Weak)");
    int choise=Integer.parseInt(scanner.nextLine());
    switch(choise){
        case 1:
            System.out.println("Good "); break;
        case 2:
            System.out.println("Quite "); break;
        case 3:
            System.out.println("Weak "); break;
        default:
            System.out.println("Error ! ");
}
}
}
