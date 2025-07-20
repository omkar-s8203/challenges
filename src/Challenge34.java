import java.util.Scanner;

public class Challenge34 {
    public static void main(String[] args) {
        System.out.println("Create a program to check whether a number is prime");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i = 2; // Start from 2 (not 0 or 1)
        boolean isPrime = true;

        if (num <= 1) {
            System.out.println("Number is not prime");
        } else {
            while (i <= num / 2) {
                if (num % i == 0) {
                    isPrime = false; // Found a divisor
                    break;
                }
                i++;
            }

            if (isPrime) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not prime");
            }
        }

        sc.close(); // Good practice to close Scanner
    }
}
