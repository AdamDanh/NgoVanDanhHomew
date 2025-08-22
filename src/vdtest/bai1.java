
package vdtest;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a mullti-word sentence: ");
        String sentence=keyboard.nextLine();
        System.out.println(sentence);
        
        System.out.println("Enter a one word string: ");
        String s= keyboard.next();
        System.out.println(s);
    }
}
