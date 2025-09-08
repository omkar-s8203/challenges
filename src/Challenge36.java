import java.util.Scanner;

/*
* Create a program to find if the given number is even or odd.
* */
public class Challenge36 {
    public static void main(String[] args) {
        System.out.println("even odd checker");
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        int number = scanner.nextInt();

        String result = number%2==0 ? "even" : "odd";
        System.out.println(result);
    }
}
