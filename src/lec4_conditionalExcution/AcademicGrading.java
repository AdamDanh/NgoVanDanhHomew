
package lec4_conditionalExcution;
import java.util.Scanner;
public class AcademicGrading {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter float");
        float a=scanner.nextFloat();
        
        if(a>=9.0 && a<=10){
            System.out.println("Xuat sac");
        }else if(a>=8.0&& a<=8.9){
            System.out.println("Gioi");
        }else if(a>=6.5 && a<=7.9){
            System.out.println("Kha");
        }else if(a>=5.0&&a<=6.4){
            System.out.println("Trung binh");
        }else if(a<5.0){
            System.out.println("Khong dat");
        }else{
            System.out.println("Khong Hop le");
        }
    }
}
