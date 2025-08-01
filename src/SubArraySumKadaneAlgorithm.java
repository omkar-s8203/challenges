public class SubArraySumKadaneAlgorithm {
    public static void main(String[] args) {
//        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};

        int numbers[] = {1,-2,6,-1,3};
        kadanes(numbers);
    }

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i = 0; i < numbers.length; i++){
            cs = cs+numbers[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(ms, cs);
        }
        System.out.println("Total subarrays: " + ms);
    }
}
