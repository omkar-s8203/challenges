public class Triangle01Pattern {
    public static void main(String[] args) {
triangle01(5);
    }

    public static void triangle01(int n){
    for (int i = 1; i <= n; i++){

        //inner loop
        for (int j = 1; j <= i; j++){
            if((i+j)%2==0){
                System.out.print("1");
            }else {
                System.out.print("0");
            }
        }

        System.out.println();
    }
    }
}
