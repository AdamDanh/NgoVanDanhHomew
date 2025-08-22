
package lec5_LoopsFor;

import java.util.Scanner;
public class PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer greater than 1: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println("n must be greater than 1.");
            return;
        }
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) { 
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}


