import java.util.Scanner;

public class Challenge14 {
    public static void main(String[] args) {
        System.out.println("create a program to convert fahrenheit to celsius");

        Scanner input = new Scanner(System.in);

        System.out.println("enter the temperature in fahrenheit");
        float f = input.nextFloat();

        float c = (f-32f)*(5f/9f);
        System.out.println("the temperature in celsious is: " + c);

    }
}
