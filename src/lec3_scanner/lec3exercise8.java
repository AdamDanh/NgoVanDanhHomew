
package lec3_scanner;
import java.util.Scanner;
public class lec3exercise8 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        
        System.out.println("Enter ");
        
        while (keyboard.hasNext()){
        String s=keyboard.next();
        System.out.println(s);
    }
}
}
