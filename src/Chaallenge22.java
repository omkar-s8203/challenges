import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Chaallenge22 {
    public static void main(String[] args) {
        System.out.println("create a program that show bitwise OR of two numbers");

        Scanner input = new Scanner(System.in);

        System.out.print("enter number a :");
        int a = input.nextInt();
        System.out.print("enter number b:");
        int b = input.nextInt();

        int result = a|b;
        System.out.println("the result is "+result);

        if (result == 0){
            System.out.println("both given numbers are zero");
        }else
        {
            System.out.println("both given numbers are "+result);
        }


    }
}
