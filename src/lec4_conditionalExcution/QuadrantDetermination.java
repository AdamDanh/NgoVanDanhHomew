
package lec4_conditionalExcution;
import java.util.Scanner;
public class QuadrantDetermination {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter x: ");
        float x=scanner.nextFloat();
        
        System.out.println("Enter y: ");
        float y=scanner.nextFloat();
        
        if(x>0 && y>0){
            System.out.println("Goc phan tu thu nhat !");
        }else if(x<0 && y>0){
            System.out.println("Goc phan tu thu hai ! ");
        }else if(x<0 && y<0){
            System.out.println("Goc phan tu thu ba !");
        }else if(x>0 && y<0){
            System.out.println("Goc phan tu thu tu ! ");
        }
        else if(x==0 && y==0){
            System.out.println("Diem nam tren mot truc !");
        }else{
            System.out.println("Khong hop le ! ");
        }
    }
}
