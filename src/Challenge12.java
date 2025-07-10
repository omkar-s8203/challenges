import java.util.Scanner;

public class Challenge12 {
    public static void main(String[] args) {
        System.out.println("Create a program to calculete simple intrest");

        //simple intrest = (P*T*R)/100

        Scanner input = new Scanner(System.in);
        System.out.println("enter a profit");
        float p = input.nextFloat();
        System.out.println("enter tax ");
        float t = input.nextFloat();
        System.out.println("enter returns");
        float r = input.nextFloat();

        float simpleIntrest = (p*t*r)/100f;

        System.out.println(simpleIntrest);
    }
}
