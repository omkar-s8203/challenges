public class HollowRhombus {
    public static void main(String[] args) {
        hollowRhombus(6);

    }

    public static void hollowRhombus(int n){
        for(int i =1; i<=n; i++){
            //inner loop

            for(int j =1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //hollow rectangle
            for(int j = 1; j<=n; j++){
                if(i == 1|| i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
