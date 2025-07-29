public class PairsInArray {
    public static void main(String[] args) {
        int numbers[]= {1,5,6,8,7,9};
pairs(numbers);

    }

    public static void pairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
           int curr = numbers[i];

           for(int j=i+1;j<numbers.length;j++){
               System.out.print("("+curr+","+numbers[j]+") , ");
           }
            System.out.println();
        }
    }
}
