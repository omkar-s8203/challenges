/*
* Create a program to find the mminimum of two numbers
* using ternary operator
* condition ? answer: answer1
* */

import java.util.Scanner;

public class Challenge35 {
    public static void main(String[] args) {
        System.out.println("Minimum of two number checker");
        Scanner input = new Scanner(System.in);

        System.out.println("enter number 1");
        int number1 = input.nextInt();
        System.out.println("enter number 2");
        int number2 = input.nextInt();

        int result = number1>number2 ? number1 : number2;
        System.out.println("Result is " + result);
    }
}
