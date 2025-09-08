/*
* Create a program to calculate the absolute value of the  given integer
* */

import java.util.Scanner;

public class Challenge37 {
    public static void main(String[] args) {
        System.out.println("calculate the absolute value");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number = scanner.nextInt();

        int y = Math.abs(number);
        System.out.println("The absolute value is " + y);
    }
}
