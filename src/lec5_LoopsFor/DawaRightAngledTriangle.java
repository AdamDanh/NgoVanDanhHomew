
package lec5_LoopsFor;
import java.util.Scanner;
public class DawaRightAngledTriangle {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Enter the height: ");
        int h=scanner.nextInt();
        
        for(int i=1;i<=h+1;i++){
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
    }
}
}
