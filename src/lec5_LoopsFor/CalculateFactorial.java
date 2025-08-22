
package lec5_LoopsFor;
import java.util.Scanner;
public class CalculateFactorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter n: ");
        int n=scanner.nextInt();
        
        int CalculateFactorial=1;
        for(int i=1;i<=n;i++){
            CalculateFactorial *= i;
            System.out.print(n +"!="+ CalculateFactorial);
        }
    }
}
