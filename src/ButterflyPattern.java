public class ButterflyPattern {
    public static void main(String[] args) {
ButterflyPatternf(4);
    }

    public static void ButterflyPatternf(int n){
//1st half
        for(int i=1; i<=n; i++){

            //starts i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            //space 2*(n-1)
            for(int j =1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        //2nd half
        for(int i = n; i>=1; i--){
            //starts i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }

            //space 2*(n-1)
            for(int j =1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars i
            for(int j =1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
