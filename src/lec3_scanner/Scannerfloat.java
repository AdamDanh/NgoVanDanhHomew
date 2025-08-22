
package lec3_scanner;
import java.util.Scanner;
public class Scannerfloat {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        
        System.out.print("Enter a float:: ");
        float f=keyboard.nextFloat();
        System.out.println(f);
        
        System.out.println("Enter a double number::");
        double d=keyboard.nextDouble();
        System.out.println(d);
    }
}
