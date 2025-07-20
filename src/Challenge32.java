import java.util.Scanner;

public class Challenge32 {
    public static void main(String[] args) {
        System.out.println("create a program to find the least common multiplication of two numbers");

        Scanner sc = new Scanner(System.in);
        System.out.print("enter number A: ");
        int first = sc.nextInt();
        System.out.print("enter number B: ");
        int second = sc.nextInt();
    int lcm = lcm(first, second);
        System.out.println("lcm = " + lcm);



    }

    public static int lcm(int first, int second) {

        int i = 1;
        while (i <= second) {
            int factor = first * i;
            if(factor % second == 0) {
                return factor;
            }
            i++;
        }

        return 0;
    }
}
