public class ReverseArray {
    public static void main(String[] args) {
int numbers[]= {1,5,95,89,26,84,12,54,99};
reverse(numbers);
for(int i=0;i<numbers.length;i++){
    System.out.println(numbers[i]);
}
    }

    public static void reverse(int numbers[]){
        int first = 0;
        int last = numbers.length-1;

        while(first<last){
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;

            first++;
            last--;

        }
    }
}
