import java.util.Scanner;

public class Challenge13 {
    public static void main(String[] args) {
        System.out.println("create a program to calculate compound intrest");

        // compound intrest = p(1+r/100)t

        Scanner input = new Scanner(System.in);

        System.out.println("enter principle amount");
        int p = input.nextInt();
        System.out.println("enter rate of intrest");
        int r = input.nextInt();
        System.out.println("enter time period");
        int t = input.nextInt();

        float compoundIntrest = p*(1f+r)/100f;

        System.out.println("the compound intrest is"+ compoundIntrest);
    }
}
