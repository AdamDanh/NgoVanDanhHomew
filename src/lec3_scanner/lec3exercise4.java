
package lec3_scanner;
import java.util.Scanner;
public class lec3exercise4 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("Enter float 1");
        float f=keyboard.nextFloat();
        
        System.out.println("Enter float 2");
        float e=keyboard.nextFloat();
        
        float sum=f+e;
        System.out.println("Sum float = "+ sum);
        
    }
}
