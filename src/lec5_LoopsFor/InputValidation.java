
package lec5_LoopsFor;
import java.util.Scanner;
public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int n;
        do{
            System.out.println("Enter 1 -> 10: ");
             n=scanner.nextInt();
        }
        while(n<1 || n>10);
        System.out.println("You entered the number: "+ n);
    }
    }
    

