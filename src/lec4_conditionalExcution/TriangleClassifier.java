
package lec4_conditionalExcution;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first side: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second side: ");
        int b = scanner.nextInt();
        System.out.print("Enter the third side: ");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("This is an equilateral triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("This is an isosceles triangle.");
            } else {
                System.out.println("This is a scalene triangle.");
            }
        } else {
            System.out.println("These sides cannot form a triangle.");
        }
        scanner.close();
    }
}

