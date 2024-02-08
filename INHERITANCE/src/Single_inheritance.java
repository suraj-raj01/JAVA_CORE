/*
Single Inheritance:- When one class inherits another class, it is known as single
level inheritance.
*/

class animal{
    public void eat(){
        System.out.println("Eating....");
    }
    }
class dog extends animal{
    public void bark(){
        System.out.println("Barking....");
    }
}
public class Single_inheritance {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.bark();
    }
}

/*

Eating....
Barking....

*/
