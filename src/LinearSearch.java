public class LinearSearch {
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10,12,14,16};
        int kay = 10;
        int index= linerasearch(numbers,kay);
        if(index==-1){
            System.out.println("Not Found");
        }else {
            System.out.println("Found at index "+index);
        }


//        System.out.println("key is at: "+linerasearch(numbers,kay));
    }

    public static int linerasearch(int number[], int key){

        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
        }
        return -1;
    }
}
