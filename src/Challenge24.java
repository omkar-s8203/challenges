import java.util.Scanner;

public class Challenge24 {
    public static void main(String[] args) {
        System.out.println("create a program that show bitwise NOT of two numbers");

        Scanner input = new Scanner(System.in);

        System.out.print("enter number a :");
        int a = input.nextInt();


        int result = ~a;
        System.out.println("the result is " + result);


    }
}
