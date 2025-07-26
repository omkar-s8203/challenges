public class FloydsTriangle {
    public static void main(String[] args) {
floydHalfPyramid(5);
    }

    public static void floydHalfPyramid(int n){
        int temp = 1;

        //outer loop
        for(int i = 1; i<=n; i++){


            for(int j =1; j<=i; j++){
                System.out.print(temp+ " ");
                 temp++;
            }
            System.out.println();
        }
    }
}
