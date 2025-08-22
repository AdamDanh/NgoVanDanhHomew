
package lec5_LoopsFor;
import java.util.Scanner;
public class RollDoubles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dice1, dice2;
        int count = 0;

        do {
            dice1 = scanner.nextInt(6) + 1;
            dice2 = scanner.nextInt(6) + 1;
            count++;

            System.out.println("Roll " + count + ": " + dice1 + " and " + dice2);
        } while (dice1 != dice2);
        System.out.println("You rolled doubles after " + count + " tries!");
    }
}
    

