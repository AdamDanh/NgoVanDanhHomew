
package lec3_scanner;
import java.util.Scanner;
public class lec3exercise3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter int 1: ");
        int a=scanner.nextInt();
       
        
        System.out.println("Enter int 2: ");
        int b=scanner.nextInt();
      
        
        int c=a+b;
        System.out.println("Sum int ="+ c);
    }
}
