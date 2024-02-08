/*
Parameterized Constructor:-
A parameterized constructor is a special type of constructor that allows you to initialize the object's properties with values passed as parameters.
*/

class Student {
    String name;
    int age;
    String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

public class parameterized_Constructor {
    public static void main(String[] args) {
        Student myObj = new Student("Suraj", 20, "Male");
        System.out.println("Name : " + myObj.name);
        System.out.println("Age : " + myObj.age);
        System.out.println("Gender : " + myObj.gender);
    }
}
