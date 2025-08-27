
package lec6_arayl;
import java.util.ArrayList;
import java.util.Scanner;

public class UnlimitedDataEntry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        System.out.println("Enter integers (enter -1 to stop):");

        while (true) {
            int num = scanner.nextInt();

            if (num == -1) { // Dung khi enter: -1
                break;
            }

            numbers.add(num);  // Add vào ArrayList
            sum += num;        // Cong vao tong
        }
        // In ketqua
        System.out.println("Numbers entered: " + numbers);
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}

