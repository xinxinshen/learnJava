package example;

public class J_Area {
    public static void main(String[] args) {
        J_shape a = new J_Circle(5);
        System.out.println("the area of circle with radius of 5 is:" + a.mb_getArea());
        a = new J_Rectangle(0, 0, 3, 4);
        System.out.println("the area of rectangle with width 3 and length 4 is: " + a.mb_getArea());
    }
}
