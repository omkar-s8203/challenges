import java.util.Scanner;

/*
* Create a program to create a simple calculator that uses a switch statement to perform basic arithmetic operations like addition, subtraction , multiplication and division
* */
public class Challenge40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple calculator");
        System.out.println("Please enter your choice \n 1: Addition \n 2: Subtraction \n 3: Multiplication \n 4: Division");
        int choice = scanner.nextInt();
        System.out.print("enter numkber 1: ");
        int num = scanner.nextInt();
        System.out.print("enter numkber 2: ");
        int num2 = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Addition of two numbers: ");
                System.out.println(num + num2);
                break;
            case 2:
                System.out.print("Subtraction of two numbers: ");
                System.out.println(num - num2);
                break;
            case 3:
                System.out.print("Multiplication of two numbers: ");
                System.out.println(num * num2);
                break;
            case 4:
                System.out.print("Division of two numbers: ");
                System.out.println(num / num2);
                break;
                default:
                    System.out.println("Invalid choice");
        }
        scanner.close();
    }
}
