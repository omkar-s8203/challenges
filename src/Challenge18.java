import java.util.Scanner;

public class Challenge18 {
    public static void main(String[] args) {
        System.out.println("create a program that determines if a given year is leap yera ");

        Scanner input = new Scanner(System.in);
        System.out.println("enter the year: ");
        int year = input.nextInt();

        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("the year is not a leap year");
                }
                else{
                    System.out.println("the year is a leap year");
                }
            }else {
                System.out.println("the year is not a leap year");
            }
        }
        else{
            System.out.println("the year is not a leap year");
        }

    }
}
