//Multi-Dimensional arrays

import java.util.Scanner;

public class array6 {
         void TwoDarray() {
         int [][] arr = {{1,2,3,4},{4,5,6}};
         System.out.println(arr[0][1]);
         System.out.println(arr[0][2]);
         System.out.println(arr[1][0]);
         System.out.println(arr[1][1]);
         System.out.println(arr[1][2]);
         System.out.println(arr[0][0]);
         System.out.println(arr[1][2]);


     }

    public static void main(String[] args) {
        array6 array = new array6();
        array.TwoDarray();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row: ");
        int r = sc.nextInt();
        System.out.print("Enter the size of col: ");
        int c = sc.nextInt();
        int [][]arr = new int[r][c];
        System.out.println("Enter the element: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
            arr[i][j] = sc.nextInt();
        }
    }
    System.out.println("Entered element is: ");
    for(int i=0; i<r; i++){
        for(int j=0; j<c; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    sc.close();
    }
}