public class FloydsTriangle {
    public static void main(String[] args) {
floydHalfPyramid(5);
    }

    public static void floydHalfPyramid(int n){
        int temp;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i; j++){
                temp =+1;
                System.out.print(temp);
            }
            System.out.println();
        }
    }
}
