
package lec3_scanner;
import java.util.Scanner;
public class lec3exercise9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter int: ");
        int number=scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("Enter sentence: ");
        String sentence= scanner.nextLine();

        System.out.println("Number: "+ number);
        System.out.println("Sentence: "+ sentence);
    }
}






 
