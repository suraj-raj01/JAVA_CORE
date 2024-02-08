abstract class person{
    abstract void walk();
    person(){
        System.out.println("Person created");
    }
    public void eat(){
        System.out.println("Eating...");
    }
}
class student extends person{
    student(){
        System.out.println("student created");
    }
    public void eat(){
        System.out.println("Eating....");
    }
    @Override
    void walk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'walk'");
    }
}
public class Abstract2 {
    public static void main(String[] args) {
        student s = new student();
            
        };
    }
