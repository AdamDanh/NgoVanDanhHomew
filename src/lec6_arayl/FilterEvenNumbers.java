
package lec6_arayl;
import java.util.Scanner;
import java.util.ArrayList;
public class FilterEvenNumbers {

    // Ham loc so chan tu mang
    public static ArrayList<Integer> filterEven(int[] arr) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 == 0) { // kiem tra so chan
                evens.add(num);
            }
        }
        return evens;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nhap so phan tu
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Nhap mang
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Goi ham loc so chan
        ArrayList<Integer> evenList = filterEven(arr);

        // In ketqua
        System.out.println("Even numbers in ArrayList: " + evenList);
        scanner.close();
    }
}

