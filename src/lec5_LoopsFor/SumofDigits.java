
package lec5_LoopsFor;
import java.util.Scanner;
public class SumofDigits {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Enter int: ");
        int n=scanner.nextInt();
        int sum=0;
        int SumofDigits=n;
        while(n>0 ){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        System.out.println("The sum of the digits "+ SumofDigits + " is "+ sum);
        scanner.close();
    }
}
