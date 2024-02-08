/*
Finally:-
The finally statement lets you execute code, after try...catch, regardless of the result:
*/
public class Exception2 {
    public static void main(String[] args) {
       try{
           int[] arr = {1,6,8};
           System.out.println(arr[10]);
       }
       catch (Exception e){
           System.out.println("Something went wrong....");
       }
       finally {
           System.out.println("Finally the 'try catch' is finished");
       }
    }
}
