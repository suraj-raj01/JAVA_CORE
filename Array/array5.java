//Loop Through an Array with For-Each

/*
Syntax:-

for (type variable : arrayname) {
  System.out.println(variable);
}

*/
// public class array5 {
//     public static void main(String[] args) {
//         int[] num = {1,2,3,4,5,6,7};
//         for(int i:num){
//             System.out.println("Value is "+i);
//         }
//     }
// }

//

import java.util.Scanner;

public class array5{
  public static void main(String[] args) {
      
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter the size of array: ");
     int n = scanner.nextInt();
     int arr[] = new int[n];

     System.out.println("Enter the "+n+" elements");
     for(int i=0; i<arr.length; i++){
        arr[i] = scanner.nextInt();
     }
     for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
     }
     scanner.close();
    }
}






