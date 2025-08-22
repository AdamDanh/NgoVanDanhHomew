
package lec4_conditionalExcution;
import java.util.Scanner;
public class QuadrantExercise {
    public static int quadrant(double x, double y) {
        if(x>0 && y>0){
            return 1;
        }else if(x<0 && y>0){
            return 2;
        }else if(x<0 && y<0){
            return 3;
        }else if(x>0&&y<0){
            return 4;
        }else{
            return 0;
        }  
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Enter x: ");
        Double x=scanner.nextDouble();
        
        System.out.println("Enter y: ");
        Double y=scanner.nextDouble();
        
        System.out.println("Anser: "+ quadrant(x, y));
        scanner.close();
    }
}

