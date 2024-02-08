// method overloading changing data type of overloading
// public class Adder1 {
//     static int add(int a, int b){
//         return a+b;
//     }
//     static double add(double a, double b){
//         return a+b;
//     }
// }
// class Addition{
//     public static void main(String[] args) {
//         System.out.println(Adder1.add(8,9));
//         System.out.println(Adder1.add(5.6,8.6));
//     }
// }

/*
Output: 
17
14.2
*/


import java.util.Scanner;
public class Adder1{
    static int Student(int age){
        return age;
    }
    static String Student(String name){
        return name;
    }
}
class StudentData{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student age: ");
        int age = sc.nextInt();
        System.out.println("Enter student Name: ");
        String name = sc.next();
        // String strCopy = name;
        System.out.print("Student Age is: "+Adder1.Student(age));
        System.out.print("Student Name is: "+Adder1.Student((name)));
    sc.close();
    }
}