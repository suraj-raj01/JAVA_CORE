import java.util.Scanner;

public class matrix {

    static void additionMatrix() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int r = sc.nextInt();
        System.out.print("Enter the number of col: ");
        int c = sc.nextInt();
        int[][] matrix1 = new int[r][c];
        System.out.println("Enter the " + r * c + " element of first Matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the " + r * c + " element of second matrix: ");
        int[][] matrix2 = new int[r][c];
        int[][] sum = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("resultant Matrix is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }

    static void searchElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of column: ");
        int col = sc.nextInt();
        int[][] number = new int[row][col];
        System.out.println("Enter the " + row * col + " element");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
        System.out.print("Search element: ");
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (number[i][j] == x) {
                    System.out.println(x + " found at index " + i + "," + j);
                }
            }
        }
        sc.close();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println("Enter the operator:");
        System.out.println("1. for addition of Matrix");
        System.out.println("2. for searchElement from Matrix");
        System.out.println("3. for exit");
        System.out.println("====================================");
        int opr = sc.nextInt();
        switch (opr) {
            case 1:
                additionMatrix();
                break;
            case 2:
                searchElement();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Please enter valid operator!");
                break;
        }
        sc.close();
    }
}

/*
Enter the number of rows: 3
Enter the number of column: 3
5 6 4
1 2 3
7 8 9
The matrix is:
5 6 4
1 2 3
7 8 9
Search element: 8
8 found at index 2,1
*/