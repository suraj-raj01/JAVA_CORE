/*
Copy Constructor in Java:-
Unlike other constructors copy constructor is passed with another object which copies the data
available from the passed object to the newly created object.
*/

class myClass {
    String name;
    int id;

    // Parameterized Constructor
    public myClass(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Copy Constructor
    public myClass(myClass s1) {
        this.name = s1.name;
        this.id = s1.id;
    }
}

public class copy_Constructor {
    public static void main(String[] args) {
        System.out.println("Parameterized Constructor");
        myClass myObj1 = new myClass("Suraj", 20);
        System.out.println("student name: " + myObj1.name + "\n" + "id is: " + myObj1.id);

        System.out.println();
        System.out.println("Copy Constructor");
        myClass myObj2 = new myClass(myObj1);
        System.out.println("student name: " + myObj2.name + "\n" + "id is: " + myObj2.id);
    }
}
