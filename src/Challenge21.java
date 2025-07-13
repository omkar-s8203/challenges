import java.util.Scanner;

public class Challenge21 {
    public static void main(String[] args) {
        System.out.println("create a program that shows bitwise AND of two numbers.");

        Scanner input = new Scanner(System.in);
        System.out.println("schocasing Bitwise AND operator");
        System.out.println("please enter the first number");
        int a = input.nextInt();
        System.out.println("please enter the second number");
        int b = input.nextInt();

        int result = a&b;

        if (result == 0){
            System.out.println("the numbers are different to output is false");
        }else {
            System.out.println("result is true");
        }
    }
}
