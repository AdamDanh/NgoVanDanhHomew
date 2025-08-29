package lec6_arayl;

import java.util.Scanner;

public class FindtheSecond_LargestElement {

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 20, 15, 20};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second-largest element is: " + secondLargest);
        }
    }
}
