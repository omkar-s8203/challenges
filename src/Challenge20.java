import java.util.Scanner;

public class Challenge20 {
    public static void main(String[] args) {
        System.out.println("Create a program that categories a parson into different age groups \n child below 13 \n teen below 20 \n adult below 60 senior above 60");


        Scanner sc = new Scanner(System.in);

        System.out.println("enter age of person");
        int age= sc.nextInt();

        if (age >= 60){
            System.out.println("senior citizen");
        }else if (age < 60 && age > 20){
            System.out.println("adult");
        }else if (age < 20 && age > 13){
            System.out.println("teen");
        }else
            System.out.println("child");


    }
}
