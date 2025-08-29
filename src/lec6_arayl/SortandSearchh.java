package lec6_arayl;

import java.util.Arrays;
import java.util.Scanner;

public class SortandSearchh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];

        // Enter 5 integer
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sap xep mang tang dan
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Enter number search
        System.out.print("Enter a number to find: ");
        int target = scanner.nextInt();

        // Tim chi so cua so can tim
        int index = -1;  // Mac dinh la khong tim thay
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        // In ket qua 
        if (index != -1) {
            System.out.println("The number " + target + " was found at index " + index + ".");
        } else {
            System.out.println("The number " + target + " was not found in the array.");
        }
    }
}
