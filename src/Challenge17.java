import java.util.Scanner;

public class Challenge17 {
    public static void main(String[] args) {
        System.out.println("create a program that determines the greatest of three numbers");

        Scanner input = new Scanner(System.in);

        System.out.print("enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("enter number 2: ");
        int num2 = input.nextInt();
        System.out.print("enter number 3: ");
        int num3 = input.nextInt();

        if(num1 > num2 && num1 > num3 ){
            System.out.println("num 1 is greater than num2 and num 3");
        } else if(num2 > num1 && num2 > num3){
            System.out.println("num 2 is greater than num3 and num 1");
        }else  {
            System.out.println("num 3 is greater than num1");
        }
    }
}

