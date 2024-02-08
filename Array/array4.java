//Loop through an array
public class array4 {
    public static void main(String[] args) {
        int[] num = {1,5,6,7,8,9,4};
        System.out.println("Original Array!");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
        int start = 0;
        int end = 6;
        while(start<end) {
             int temp = num[start];
             num[start] = num[end];
             num[end] = temp;
             start++;
             end--;
        }
        System.out.println();
        System.out.println("Reversed Array!");
        for(int i=0; i<num.length; i++){
            System.out.print(num[i]+" ");
        }
    }
}
