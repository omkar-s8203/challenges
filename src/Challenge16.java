import java.util.Scanner;

public class Challenge16 {
    public static void main(String[] args) {
        System.out.println("create a program that determines if a number is odd or even");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an number");
        int number = input.nextInt();

        if(number%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
