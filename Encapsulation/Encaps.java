//data hiding using private specifier.

import java.util.Scanner;

class Area {
    private int length;
    private int width;

    // public int getLength() {
    //     return length;
    // }

    // public void setLength(int length) {
    //     this.length = length;
    // }

    // public int getWidth() {
    //     return width;
    // }

    // public void setWidth(int width) {
    //     this.width = width;
    // }

    public int getArea() {
        return length * width;
    }

    public void setArea(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

public class Encaps {
    public static void main(String[] args) {
        Area area = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length: ");
        int l = sc.nextInt();
        System.out.print("Enter the width: ");
        int w = sc.nextInt();
        // area.setLength(10);
        // area.setWidth(10);
        // area.setArea(l, w);
        System.out.println("Area is: "+area.getArea());
        sc.close();
    }
}
