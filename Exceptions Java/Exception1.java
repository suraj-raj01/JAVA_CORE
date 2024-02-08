/*
Java Exceptions:-
When executing Java code, different errors can occur: coding errors made by the programmer,
errors due to wrong input, or other unforeseeable things.
                            When an error occurs, Java will normally stop and generate an
error message. The technical term for this is: Java will throw an exception (throw an error).

Syntax for try,catch

try {
  //  Block of code to try
}
catch(Exception e) {
  //  Block of code to handle errors
}
*/


public class Exception1 {
    public static void main(String[] args) {
//        int[] arr = {1,5,6,4,5};
//        System.out.println(arr[10]);  // Exception errors

/*If an error occurs, we can use try...catch to catch the error and execute some code to
  handle it:
 */

     try{
         int[] array = {1,2,3,5,4};
         System.out.println(array[10]);
     }
     catch (Exception e){
         System.out.println("ArrayOutOfBouncd error!");
     }
    }
}
