import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {
        System.out.println("create a program to calculate the area of triangle");


        // area of triangle = 1/2 * b*h

        Scanner input= new Scanner(System.in);

        System.out.println("enter b of triangle");
        float b = input.nextFloat();
        System.out.println("enter height of triangle");
        float h = input.nextFloat();

        float result= 0.5f*b*h;
        System.out.println("the area of triangle is"+ result);
    }
}
