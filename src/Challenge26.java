import java.util.Scanner;

public class Challenge26 {
    public static void main(String[] args) {
        System.out.println("Create a program that shows user of right shift operator");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of operators");
        int a = scanner.nextInt();

        int result = a >> 1;
        System.out.println("the result is "+result);
    }
}
