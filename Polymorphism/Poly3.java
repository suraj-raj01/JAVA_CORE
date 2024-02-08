/*
2. Run-time Polymorphism:-
In the previous example, we have seen how to use static polymorphism by using function overloading
and operator.
Now let's see another form of polymorphism called run time polymorphism. Overriding is the example
of run-time polymorphism.
*/

class Test{
    public void display(){
        System.out.println("Method-1");
    }
}
class TestSub extends Test {
    public void display(){
        System.out.println("Method-2");
    }
}

//Derived Class
public class Poly3 {
    public static void main(String[] args) {
        // Test t = new TestSub();
        // t.display();
        Test t;
        t = new TestSub();
        t.display();
    }
}
