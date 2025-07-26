public class HollowRectanglePattern {

    public static void hollow_rectangle(int tolrows, int tolcols){

        //outer loop
        for(int i = 1; i<= tolrows; i++){
            // inner loop
            for(int j = 1; j<= tolcols; j++){
                if(i == 1 || i == tolrows || j == 1 || j == tolrows){
                   //boundary cell
                    System.out.print("*");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {

        System.out.println("Hollow Rectangle Pattern");
        hollow_rectangle(14,20);

    }
}
