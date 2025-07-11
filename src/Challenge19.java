import java.util.Scanner;

public class Challenge19 {
    public static void main(String[] args) {
        System.out.println("creaate a program that calculates grades basaed on marks");
        System.out.println("A -> abhove 90% \nb -> abhove 75% \n C ->abhove 60% \n D -> abhove 30%  \n F below 30%");

        Scanner input = new Scanner (System.in);

        System.out.println("please enter marks");
        int marks = input.nextInt();

        if(marks > 100){
            System.out.println("marks must be less than 100 or 100");
        } else {
            if (marks >= 90) {
            System.out.println("A grade ");
        } else if (marks >= 75) {
            System.out.println("B grade ");

        }else if (marks >= 60){
                System.out.println("C grade ");
            } else if (marks >= 30){
                System.out.println("D grade ");
            }
            else{
                System.out.println("F grade ");
            }

        }

    }
}
