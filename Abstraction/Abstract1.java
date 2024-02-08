/*
Abstraction:- in simple terms, it is hiding the assential parts / functionalities
to the users

Abstraction is achieved in two ways:-
1. Abstract class
2. Interface (pure Abstraction)
*/

abstract class animal{
    public abstract void eat(); //abstract method
}
class dog extends animal {
    public void eat(){
        System.out.println("Dog eats meat");
    }
}
class goat extends animal{
    public void eat(){
        System.out.println("goat eat grass");
    }
}

public class Abstract1  {
    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        goat g=new goat();
        g.eat();
    }
}

/*
Dog eats meat
goat eat grass
*/