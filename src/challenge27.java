import java.util.Scanner;

public class challenge27 {
    public static void main(String[] args) {
        System.out.println("write a program to check if a given number is even or odd using bitwise operator");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scanner.nextInt();

        if((a&1)==1){
            System.out.println("your number is odd");
        }else{
            System.out.println("your number is even");
        }



    }
}
