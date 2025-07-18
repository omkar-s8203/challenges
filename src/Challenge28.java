import java.util.Scanner;

public class Challenge28 {
    public static void main(String[] args) {
        System.out.println("Develop a program that prints the multiplication table for a given number");

        System.out.println("Multiplication table function");
        System.out.println("enter the NUmber which table wants: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        while(i <= 10 ){
            System.out.println(n + "* "+ i+ " = " + (i*n));
            i++;

        }
    }
}
