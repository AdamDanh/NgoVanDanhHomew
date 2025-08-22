
package lec4_conditionalExcution;
import java.util.Scanner;
public class AgeGroupCategorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter age: ");
        int a=scanner.nextInt();
        
        if(a>0 && a<=12){
            System.out.println("Tre em ");
    }
        else if(a>=13 && a<=19){
            System.out.println("Thieu nien ");
        }else if(a>=20 && a<=59){
            System.out.println("Nguoi lon ");
        }else if(a>=60){
            System.out.println("Nguoi cao tuoi ");
        }else{
            System.out.println("Zero ");
        }
}
}
