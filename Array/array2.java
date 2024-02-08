//Change an array element

// public class array2 {
//     public static void main(String[] args) {
//         int[] num = {2,5,8,7,6};
//         num[1] = 3;
//         System.out.println("The new value of the second element is: " +num[1]);
//     }
// }

public class array2{
    public static void main (String []args){
        String[] months = {"apr", "Feb", "Mar"};
        months[0] = "Jan";
        System.out.println(months[0]);
        System.out.println(months[1]);
        System.out.println(months[2]);

        // for loop
        for(int i=0; i<months.length; i++){
            System.out.print(months[i]+" ");
        }
    }
}