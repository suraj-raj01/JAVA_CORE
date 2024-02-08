// Method overloading change no. of parameters


public class Adder {

    // Method overloading: add(int a, int b)
    static int add(int a, int b) {
        System.out.print("sum is: ");
        System.out.println(a + b);
        return 1;
    }

    // Method overloading: add(int a, int b, int c)
    static int add(int a, int b, int c) {
        System.out.print("sum is: ");
        System.out.print(a + b + c);
        return 1;
    }

    public static void main(String[] args) {
        add(5, 6); // Adds 5 and 6
        add(1, 5, 9); // Adds 1, 5, and 9
    }
}


/*
Output:
13
21
*/

//Same name but different parameters
/* 
public class Adder{
   static int add(int x, int y){
      return x+y;
   }
   static double add(double x, double y){
   return x+y;
   }
   public static void main(String[] args) {
      System.out.println(add(1,5));
      System.out.println(add(2.5,8.6));
   }
}

*/
//--------------------------------------------------------------------------------

//Now in different Ways

// import java.util.Scanner;
// public class Adder{
//     static int add(int a, int b){
//         return a+b;
//     }
//     static int add(int a, int b, int c){
//         return a+b+c;
//     }
// }
// class overloading{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter the second number: ");
//         int b = sc.nextInt();
//         System.out.print("Enter the third number: ");
//         int c = sc.nextInt();
//         System.out.println(Adder.add(a,b));
//         System.out.println(Adder.add(a,b,c));
// sc.close();
//     }
// }

/*
Enter the first number: 5
Enter the second number: 5
Enter the third number: 5
10
15
*/

