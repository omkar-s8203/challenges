import java.util.Scanner;

public class Challenge10 {
    public static void main(String[] args) {
        System.out.println("create a program to calculate perimeter of rectangle");

        System.out.println("perimeter of rectriangle is ABCD = A+B+C+D");

        Scanner input = new Scanner(System.in);
        System.out.println("enter side a");
        int a = input.nextInt();
        System.out.println("enter side b");
        int b = input.nextInt();
        System.out.println("enter side c");
        int c = input.nextInt();
        System.out.println("enter side d");
        int d = input.nextInt();

 int perimeter = a+b+c+d;
        System.out.println("perimeter of rectrangle is"+ perimeter);
    }


}
