/*
This is the example of Run-time Polymorphism.
*/

class Shape{
    public void draw(){
        System.out.println("This is a Circle");
    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("This is a Triangle");
    }
}
class Rectangle extends Shape{
    public void draw(){
        System.out.println("This is a Rectangle");
    }
}
class Draw extends Shape{
    public void draw(){
        System.out.println("This is Drawing...");
    }
}
public class Poly4 {
    public static void main(String[] args) {
        Shape s;
        s = new Shape();
        s.draw();
        s = new Rectangle();
        s.draw();
        s = new Triangle();
        s.draw();
        s = new Draw();
        s.draw();
    }
}

/*
Output: 
This is a Circle
This is a Rectangle
This is a Triangle 
This is Drawing... 
*/