public class InvertedAndROtatedHalfPyramid {
    public static void main(String[] args) {
    invertedAndROtatedHalfPyramid(5);
    }

    public static void invertedAndROtatedHalfPyramid(int n){
    for (int i =1 ; i <= n; i++){
        for (int j = 1; j <= n-i; j++){
            System.out.print(" ");
        }
        for  (int j =1; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
