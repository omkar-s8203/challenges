public class LargestNUmberArray {
    public static void main(String[] args) {
        int numbers[]= {1,48,59,14,98,15,889};
       int large= largestNumber(numbers);
       int small= smallest(numbers);
        System.out.println("largest value in numbers is: "+large);
        System.out.println("smallest value in numbers is: "+small);
    }

    public static int smallest(int numbers[]){
        int Smallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){

            if(numbers[i]<Smallest){
                Smallest = numbers[i];
            }
        }
        return Smallest;
    }

    //method for TO find larger number
    public static int largestNumber(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity


        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
        }
        return largest;
    }



}
