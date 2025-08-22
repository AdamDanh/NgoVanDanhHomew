
package lec4_conditionalExcution;
import java.util.Scanner;
public class EvenorOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter int: ");
        int i=scanner.nextInt();
        
        if(i%2==0){
            System.out.print(i);
            System.out.print(" la mot so chan");
        }else{
            System.out.print(i);
            System.out.println(" la mot so le");
    }
}
}
