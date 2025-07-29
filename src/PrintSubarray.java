public class PrintSubarray {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5,6,7,8,9};
printSubarray(numbers);

    }

    public static void printSubarray(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            int curr =  numbers[i];
            System.out.print(curr+",");
            for(int j=i+1;j<numbers.length;j++){
                System.out.print(numbers[j]+",");
            }
            System.out.println();
        }
    }
}
