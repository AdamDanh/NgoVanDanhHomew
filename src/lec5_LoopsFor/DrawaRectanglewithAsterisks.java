/*
Enter h,r;
lap i tu 1 den h
lap j tu 1 den r va in dau *
roi xuong dong sau 1 lan lap
*/
package lec5_LoopsFor;
import java.util.Scanner;
public class DrawaRectanglewithAsterisks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the height: ");
        int h=scanner.nextInt();
        
        System.out.println("Enter width");
        int r=scanner.nextInt();
        
        for(int i=0;i<h;i++){//Vong lap ngoai hàng
            for(int j=0;j<r;j++){  //Vong lap trong cot
            System.out.print("*");   //Luu y print in tren cung 1 dong 
        }
        System.out.println(); //Sau khi in xong 1 dong thi xuong dong 
    }
}
}
