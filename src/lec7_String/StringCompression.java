package lec7_string;

import java.util.Scanner;

public class StringCompression {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // If chuoi rong thi in luon
        if (input.isEmpty()) {
            System.out.println("Compressed string: ");
            return;
        }

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        // Duyet qua chuoi
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++; // neu ky tu trung truoc do thi dem lai
            } else {
                // Them ky tu va so lan lap 
                compressed.append(input.charAt(i - 1)).append(count);
                count = 1; // reset dem
            }
        }

        // Them ky tu cuoi cung 
        compressed.append(input.charAt(input.length() - 1)).append(count);

        System.out.println("Compressed string: " + compressed.toString());
    }
}
