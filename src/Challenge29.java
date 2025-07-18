import java.util.Scanner;

public class Challenge29 {
    public static void main(String[] args) {
        System.out.println("create a program to sum all add numbers from 1 to specificd number N");

        System.out.println("Enter a number till you wants addition of odd number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int result = 0;

        while(i <= n){
            if(i % 2 == 1){
               result += i;
            }
            i++;
        }

        System.out.println(result);
    }
}
