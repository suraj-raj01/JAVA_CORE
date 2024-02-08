/*
Hierarchical Inheritance:- When two or more classes inherits a single class, known as the Hierarchical
inheritance.
*/

class Animals {
    public  void eat() {
        System.out.println("Eating...");
    }
}

class Dogs extends Animals {
    public  void bark() {
        System.out.println("Barking...");
    }
}

class BabyDogs extends Animals {
    public  void sleep() {
        System.out.println("Sleeping...");
    }
}

public class Hierarchical_Inheritance {
    public static void main(String[] args) {
        BabyDogs d = new BabyDogs();
        d.sleep();
        // d.eat();   Error: Cannot resolve method 'eat()' because it is not visible from type 'BabyDogs'
        d.eat();
    }
}

/*
 * Sleeping...
 * Eating...
 */