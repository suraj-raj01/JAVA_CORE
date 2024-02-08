public class ToString {
    public static void main(String[] args) {
        Integer i = Integer.valueOf(50);
        System.out.println(i);
        Integer myint = 100;
        System.out.println(myint);
        //convert int value to String
        String myString = myint.toString();
        System.out.println("length is: "+myString.length());
        //convert upper case to lowercase
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str1 = str.toLowerCase();
        System.out.println(str1);
        //convert lower to uppercase
        String str2 = str1.toUpperCase();
        System.out.println(str2);
    }
}

/*
100
length is: 3
abcdefghijklmnopqrstuvwxyz
ABCDEFGHIJKLMNOPQRSTUVWXYZ
*/