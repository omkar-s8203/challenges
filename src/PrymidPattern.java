public class PrymidPattern {
    public static void main(String[] args) {
prymid(5);
    }

    public static void prymid(int n){
        for(int i =1; i<=n; i++){

            for(int j =1; j<= (n-i); j++){
                System.out.print(" ");
            }

            for(int j =1; j<=(2*i)-1; j++){
                System.out.print("*");
            }


            System.out.println();
        }
    }
}
