package lec7_string;

import java.util.Scanner;

public class CountWordsinaString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[] words = text.trim().split("\\s+");
        int count = words.length;

        System.out.println("The number of words in the string is: " + count);
    }
}

