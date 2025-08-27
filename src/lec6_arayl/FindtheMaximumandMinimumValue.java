
package lec6_arayl;
import java.util.Scanner;
public class FindtheMaximumandMinimumValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap so phan tu cua mang
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] a = new int[n]; // Tao mang n phan tu
        // Nhap cac phan tu mang
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        // Khoi tao max and min
        int max = a[0];
        int min = a[0];
        // Duyet mang de tim min and max
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i]; // update max
            }
            if (a[i] < min) {
                min = a[i]; // update min
            }
        }
        System.out.println("The maximum value is: " + max); //in max
        System.out.println("The minimum value is: " + min); //in min

        scanner.close();
    }
}

