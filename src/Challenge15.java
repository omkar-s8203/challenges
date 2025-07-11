import java.util.Scanner;

public class Challenge15 {
    public static void main(String[] args) {
        System.out.println("Create a program that determines if a number is positive, negative or zero");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();

        if(number == 0){
            System.out.println("The number is zero");
        }else if(number < 0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is positive");
        }
    }
}
