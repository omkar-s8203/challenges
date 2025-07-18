import java.util.Scanner;

public class Challenge30 {
    public static void main(String[] args) {
        System.out.println("Write a function that calculate the factorial of a given number");

        System.out.println("Enter a number of which factorial wants");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        System.out.println(factorial(n));

    }

    public static int factorial(int n){
        int result = 1;
        while(n > 1){
            result *= n;
            n--;
        }
        return result;
    }
}
