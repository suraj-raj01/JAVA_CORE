/*
Hybrid Inheritance :- Hybrid inheritance is the combination of the single, multilevel, heirarchical
Inheritance.
*/

// Hybrid inheritance with single level inheritance.
class C{
    public static void disp(){
        System.out.println("C");
    }
}
class A extends C{
    public static void disp(){
        System.out.println("A");
    }
}
class B extends C{
    public static void disp(){
        System.out.println("B");
    }
}
class Hybrid_Inheritance extends A{
    public static void disp(){
        System.out.println("HYBRID INHERITANCE");
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        Hybrid_Inheritance d = new Hybrid_Inheritance();
        a.disp();
        b.disp();
        c.disp();
        d.disp();
    }
}

/*
A
B
C
HYBRID INHERITANCE
*/