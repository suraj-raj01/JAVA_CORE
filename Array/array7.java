//Loop Through a Multi-Dimensional Array

/* 
public class array7 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 5, 6}};
        for (int i=0 ; i<array.length ;i++){
            for(int j=0; j<array[i].length; j++){
                System.out.println(array[i][j]);
            }
        }
    }
}
*/

/*
public class array7{
    public void Printarray(){
           int [] arr = {2,5,8};

        //    for-each loop
           for(int a : arr){
            System.out.println(a);
           }
        //  for loop
        for(int i=0; i<3; i++){
            System.out.println(arr[i]);
        }
        //  while loop
        int i = 0;
        while(i<3){
            System.out.println(arr[i]);
            i++;
        }
    }
    public static void main(String[] args) {
        array7 myobj = new array7();
        myobj.Printarray();
    }
}
*/

public class array7 {

    public void multiArray(){

        int [][] arr = {{1,3,5},{6,8,7}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
    public static void main(String[] args) {
        array7 myArr = new array7();
        myArr.multiArray();
    }
}



















