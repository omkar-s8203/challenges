public class DiamondPattern {
    public static void main(String[] args) {
diamond(5);
    }

    public static void diamond(int n){
        for(int i = 1; i<= n; i++){
            //inner loop

             for(int j = 1; j<= (n-i); j++){
                 System.out.print(" ");
             }

             for (int j =1; j<=(2*i)-1; j++){
                 System.out.print("*");
             }

            System.out.println();

        }
        for(int i = n; i>= 1; i--){
            //inner loop

            for(int j = 1; j<= (n-i); j++){
                System.out.print(" ");
            }

            for (int j =1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
