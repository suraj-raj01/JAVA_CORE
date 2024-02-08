/*
Compile-time Polymorphism:-
Compile time polymorphism is a type of polymorphism in which the function overloading and operator
overloading are used at compile time.

Overloading means the function name could be same with different parameters.
*/

class Student{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println("Student name: "+name);
    }
    public void printInfo(int age){
        System.out.println("Student age: "+age);
    }
    public void printInfo(String name, int age){
        System.out.println("Student Name: "+name+" Student Age: "+age);
    }
}

public class Poly2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.printInfo("Suraj");
        s1.printInfo(20);
        s1.printInfo("Suraj", 20);
    }
}

/*
import java.util.Scanner;

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println("Student name: " + name);
    }

    public void printInfo(int age) {
        System.out.println("Student age: " + age);
    }

    public void printInfo(String name, int age) {
        System.out.println("Student Name: " + name + " Student Age: " + age);
    }
}

public class Poly2 {
    public static void main(String[] args) {
        // Create an object for student
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        Student s1 = new Student();
        for (int i = 0; i < num; i++) {

            System.out.print("Enter the name: ");
            String name = sc.next();
            System.out.print("Enter the age: ");
            int age = sc.nextInt();
            System.out.print("Enter the full info (Name & Age): ");
            String nm = sc.next();
            int a = sc.nextInt();
            System.out.println("===========================================");
            s1.printInfo(name);
            s1.printInfo(age);
            s1.printInfo(nm, a);
            System.out.println("=========================================");
            System.out.println("\n");
        }
        sc.close();
    }
}
*/
