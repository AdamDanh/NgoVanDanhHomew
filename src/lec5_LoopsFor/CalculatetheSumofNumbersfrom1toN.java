
package lec5_LoopsFor;
import java.util.Scanner;
public class CalculatetheSumofNumbersfrom1toN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter int: ");
        int n=scanner.nextInt();
        
        int sum=0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
            System.out.println("The sum of numbers from 1 "+ n +" to"+ sum);
        }
    }
}
