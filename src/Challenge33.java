import java.util.Scanner;

public class Challenge33 {
    public static void main(String[] args) {
        System.out.println("create a program to find the greatest commom devisor of two number");

        System.out.print("enter number A: ");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        System.out.print("enter number B: ");
        int second = sc.nextInt();
        int gcd = gcd(first, second);
        System.out.println("gcd = " + gcd);
    }

    public  static int gcd(int first, int second){
        int gcd = 1;
        int i = 2;
        int least = least(first, second);

        while(i<= least){

            if (first % i == 0 && second % i== 0){
                gcd = i;
            }

            i++;
        }

        return gcd;
    }

    public static int least(int first, int second){
        if (first < second){
            return first;
        }else {
            return second;
        }
    }
}
