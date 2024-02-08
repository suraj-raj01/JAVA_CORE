/*Java Constructors:-
A constructor in Java is a special method that is used to initialize objects. The constructor is 
called when an object of a class is created. It can be used to set initial values for object 
attributes:
*/
public class constructor {
    String name;
    int age;

    public constructor(String Student_name, int Student_age) {
        name = Student_name;
        age = Student_age;
    }

    public static void main(String[] args) {
        constructor myObj = new constructor("suraj", 20);
        System.out.println("Student name is: " + myObj.name + " \n" + "Student age is: " + myObj.age);
    }
}

/*
 * In the above code snippet, we have a class named "constructor". Inside this
 * class, there are two attributes - 'name' and 'age
 */

/*
 * There are three types of constructor in java :-
 * 1. Non-Parameterized Constructor
 * 2. Parameterized Constructor
 * 3. Copy Constructor
 */

