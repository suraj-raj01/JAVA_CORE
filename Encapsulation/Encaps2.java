/*
Java Encapsulation:-
Encapsulation is one of the key features of object-oriented programming. Encapsulation refers to 
the bundling of fields and methods inside a single class.
*/

import java.util.Scanner;

class sum{
    int a;
    int b;
    sum(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void getsum(){
        int result = a+b;
        System.out.println("the sum is: "+result);
    }
}
public class Encaps2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        sum s = new sum(a,b);
        s.getsum();
    }
}
