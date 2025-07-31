public class BinarySearch {
    public static void main(String[] args) {
        int numbers[] = {1,3,4,5,6,7,8,9,10,12,45,89,98,65};
        int key = 48;
        int index = binarySearch(numbers,key);
        System.out.println("The key is at Index: "+index);
    }

    public static int binarySearch(int numbers[], int key){
       int start = 0;
       int end = numbers.length-1;

       while(start<=end){
           int mid = (start+end)/2;

           //comparisons
           if(numbers[mid]==key){
               return mid;
           }

           if(numbers[mid]>key){
               end = mid-1;
           }
           else{
               start = mid+1;
           }
       }

        return -1;
    }
}
