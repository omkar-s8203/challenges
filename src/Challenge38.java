import java.sql.SQLOutput;
import java.util.Scanner;

/*
* Create a program to Based on students scroe, categorize as "high", "Moderate, Or "low" using of a given integer
* */
public class Challenge38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Score checker");

        System.out.println("Enter an Score");
        int score = scanner.nextInt();

        String result = (score>= 80) ? "HIgh":
                        (score>=50) ? "Moderate" :
                                "low";
        System.out.println("Result is " + result);
    }
}
