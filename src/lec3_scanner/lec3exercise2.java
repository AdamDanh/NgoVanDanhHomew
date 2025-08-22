
package lec3_scanner;
import java.util.Scanner;
public class lec3exercise2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String sentence=keyboard.nextLine();
        
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter age: ");
        int number=Scanner.nextInt();
        
        
        System.out.print("Hello "+ sentence);
        System.out.print(", Friend age "+ number);
    }
}
