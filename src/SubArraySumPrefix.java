public class SubArraySumPrefix {

    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        printSubArray(numbers);
    }

    public static void printSubArray(int[] numbers) {
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]=new int[numbers.length];


        prefix[0]=numbers[0];
        //calculate prefix array
        for(int i =1; i< prefix.length; i++){
            prefix[i]=prefix[i-1]+numbers[i];
//            System.out.println(numbers[i]);
//            System.out.println(prefix[i]);
        }


        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end]-prefix[start-1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }

        }
        System.out.println("Total subarrays: " + maxSum);
    }
}

