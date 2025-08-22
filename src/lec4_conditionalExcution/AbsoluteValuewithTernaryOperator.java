
package lec4_conditionalExcution;
import java.util.Scanner;
public class AbsoluteValuewithTernaryOperator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter number");
        int n=scanner.nextInt();
        
        int AbsoluteValuewithTernaryOperator=(n>=0)? n:-n;
        System.out.println("Gia tri tuyet doi la "+ AbsoluteValuewithTernaryOperator);
    }
}
