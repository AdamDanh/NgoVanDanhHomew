
package lec4_conditionalExcution;
import java.util.Scanner;
public class FindtheMaximumofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter int 1");
        int a=scanner.nextInt();
        
        System.out.println("Enter int 2");
        int b=scanner.nextInt();
        
        System.out.println("Enter int 3");
        int c=scanner.nextInt();
        
        if(a>=b && a>=c){
            System.out.println("So lon nhat la: "+ a);
    }else if(b>=a && b>=c){
            System.out.println("So lon nhat la: "+ b);
    }else{
            System.out.println("So lon nhat la: "+ c);
    }
}
}