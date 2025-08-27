
package lec6_arayl;
import java.util.Scanner;
public class CountOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhap so phan tu mang
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        // Nhap mang
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Nhap so X can tim
        System.out.print("Enter the number X to count: ");
        int X = scanner.nextInt();

        // Dem so lan X xuat hien
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == X) {
                count++;
            }
        }
        // In ket qua sau khi dem
        System.out.println("The number " + X + " appears " + count + " times.");
        scanner.close();
    }
}

