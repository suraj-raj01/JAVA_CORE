/*
The throw keyword:-
The 'throw' statement allows you to create a custom error.
The throw statement is used together with an exception type. There are many exception types
available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException,
SecurityException, etc:
*/
import java.util.Scanner;
public class Exception3 {
    static void checkAge(int age){
        if(age<18){
            throw new ArithmeticException("Access Denied!");
        }
        else{
            System.out.println("Access granted");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        checkAge(age);
    sc.close();
}
}
