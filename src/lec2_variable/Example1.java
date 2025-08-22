
package lec2_variable;

public class Example1 {
    public static void main(String [] args)
    {
    int x=1;
    int y=x++ + ++x + ++x +x +x-- -x - x--;
    System.out.println("a=" +x);
    System.out.println("b=" +y);
    
}
}
