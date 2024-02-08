/*
Non-Parameterized or Default Constructor:-
A constructor that has no parameters is known as default the constructor. A default constructor is 
invisible. And if we write a constructor with no arguments, the compiler does not create a default 
constructor. It is taken out.
*/
class MyObj {
    MyObj() {
        System.out.println("Default or Non-parameterized Constructors");
    }
}

public class default_Constructor {
    public static void main(String[] args) {
        MyObj a = new MyObj();
    }
}

// output:
// Default Constructor or Non-parameterized Constructors