public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        invertedAndROtatedHalfPyramid(5);
    }

    public static void invertedAndROtatedHalfPyramid(int n){
        for  (int i = 0; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
