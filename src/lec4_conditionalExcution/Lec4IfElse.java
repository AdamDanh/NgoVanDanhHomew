package lec4_conditionalExcution;

import java.util.Scanner;

public class Lec4IfElse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 42;
        int y = 17;
        int z = 25;

        if (y < x && y <= z) {
            System.out.println("TRUE !");
        } else {
            System.out.println("FALSE !");
        }
        if(x%2==y%2||x%2==z%2){
            System.out.println("TRUE"); 
    }else{
            System.out.println("FALSE");

}
        if(x<=y+z && x>=y+z){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }if(!(x<y&&x<z)){
            System.out.println("TRUE");
        }else{
            System.out.println("FASLE");
        }
        if((x+y) %2 ==0||!((z-y)%2==0)){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
}
}
