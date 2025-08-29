package lec6_arayl;
import java.util.Scanner;
public class ReverseanArray {
    // Ham dao nguoc mang in place
    public static void reverse(int[] a) {
        int n = a.length;
        for (int i = 0; i < n / 2; i++) {
            // Hoan doi a[i] voi a[n - 1 - i]
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Nhap so phan tu
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        // Enter array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Dao nguoc array
        reverse(arr);
        // in arry sau khi dao
        System.out.print("Array after reversal: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        scanner.close();
    }
}

