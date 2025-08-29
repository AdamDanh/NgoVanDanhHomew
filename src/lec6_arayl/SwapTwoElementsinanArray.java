package lec6_arayl;

import java.util.Arrays;

public class SwapTwoElementsinanArray {

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30};
        System.out.println("Original array: " + Arrays.toString(array));
        swap(array, 0, 2);
        System.out.println("Array after swap: " + Arrays.toString(array));
    }
}
