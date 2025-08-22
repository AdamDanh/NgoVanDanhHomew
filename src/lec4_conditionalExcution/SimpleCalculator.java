
package lec4_conditionalExcution;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Enter int 1");
        int a=scanner.nextInt();
        
        System.out.println("Enter int 2");
        int b=scanner.nextInt();
        
        System.out.println("Enter 1 or 2 or 3 or 4 ");
        int n=scanner.nextInt();
        
        switch(n){
            case 1 : System.out.println(a+b); break;
            case 2 : System.out.println(a-b); break;
            case 3 : System.out.println(a*b); break;
            case 4 : System.out.println(a/b); break;
            default: System.out.println("N/A \n");
    }
}
}
