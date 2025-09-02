
package lec7_string;
import java.util.Scanner;
public class CapitalizeaProperName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter is sentence: ");
        String name=scanner.nextLine();
        
        //Xoa khong trang dau va cuoi 
        String n=name.trim();
        
        //Tach thanh mang thie tung khoang trang
        String[] words=n.split("\\s+");
        
        //Dung StringBuilder de ghep ket qua
        StringBuilder result=new StringBuilder();
        
        for(String word:words)
        {
            String normalized= word.substring(0,1).toUpperCase()+
                    word.substring(1).toLowerCase();
            result.append(normalized).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
