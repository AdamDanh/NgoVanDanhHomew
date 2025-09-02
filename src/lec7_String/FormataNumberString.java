package lec7_string;

import java.util.Scanner;

public class FormataNumberString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number string: ");
        String number = scanner.nextLine();

        StringBuilder sb = new StringBuilder(number);

        int count = 0;
        for (int i = sb.length() - 1; i > 0; i--) {
            count++;
            if (count % 3 == 0) {
                sb.insert(i, ",");
            }
        }

        System.out.println("Formatted number: " + sb.toString());
    }
}
