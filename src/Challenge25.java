import java.util.Scanner;

public class Challenge25 {
    public static void main(String[] args) {
        System.out.println("Create a program that shows user of left shift operator");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of operators");
        int a = scanner.nextInt();

        int result = a << 1;
        System.out.println("the result is "+result);
    }
}
