/*
 Multilevel Inheritance:- When there is a chin of inheritance, known as multilevel inheritance.
*/

class Animal{
    public  void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    public  void bark(){
        System.out.println("Barking...");
    }
}
class BabyDog extends Dog{
    public  void weep(){
        System.out.println("Weeping...");
    }
}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}


/*

Weeping...
Barking...
Eating...

*/