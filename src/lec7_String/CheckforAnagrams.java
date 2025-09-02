package lec7_string;

import java.util.Arrays;
import java.util.Scanner;

public class CheckforAnagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter string
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Goi ham kiem tra 
        if (areAnagrams(str1, str2)) {
            System.out.println("The two strings are Anagrams.");
        } else {
            System.out.println("The two strings are not Anagrams.");
        }
    }

    // Ham kiem tra Anagram
    public static boolean areAnagrams(String s1, String s2) {
        // Bo khoang trang + va chuyen ve chu thuong 
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        // Neu do dai khac nhau thi ko phai
        if (s1.length() != s2.length()) {
            return false;
        }

        // Chuyen ve mang ky tu va sap xep 
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // So sanh hai mang 
        return Arrays.equals(arr1, arr2);
    }
}
