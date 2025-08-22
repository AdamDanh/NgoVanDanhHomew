package lec5_LoopsFor;
import java.util.Scanner;

public class CalculateAverageUntil0isEntered {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextInt();
            if (number == 0) {
                break; // thoát khi nhập 0
            }
            sum += number;
            count++;
        }
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("The average is: " + average);
        } else {
            System.out.println("No numbers were entered.");
        }
        scanner.close();
    }
}
