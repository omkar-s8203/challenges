import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {
        System.out.println("create a program that takes two number and show results of all arithmetic operators");

        int a;
        int b;

        Scanner input = new Scanner(System.in);
        System.out.println("enter the first number");
        a = input.nextInt();
        System.out.println("enter the second number");
        b = input.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


    }
}
