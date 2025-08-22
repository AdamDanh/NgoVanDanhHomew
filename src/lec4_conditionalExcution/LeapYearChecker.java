
package lec4_conditionalExcution;
import java.util.Scanner;
public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter years ");
        int a=scanner.nextInt();
        
        if(a%4==0 && a/100!=0 || a%400==0){
        System.out.print(a);
        System.out.println(" la nam nhuan ");
    }else{
            System.out.println("a khong phai la nam nhuan ");
        }
    }
}
