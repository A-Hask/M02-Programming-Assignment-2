import java.lang.Math;
import java.util.Scanner;

public class Triangle extends GeometricObject{
    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;
    private boolean filled = false;
    private String color = "";

    Triangle(){
    }

    Triangle(double newSide1, double newSide2, double newSide3, boolean newFilled, String newColor){
        side1 = newSide1;
        side2 = newSide2;
        side3 = newSide3;
      	filled = newFilled;
      	color = newColor;
    }

    double getSide1(){
        return side1;
    }

    double getSide2(){
        return side2;
    }

    double getSide3(){
        return side3;
    }

    @Override
    public double getArea() {
        var s=(side1 + side2 + side3) / 2;
        var area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("The area is " + area + ".");
        return area;
    }

    @Override
    public double getPerimeter() {
        var perimeter = side1 + side2 + side3;
        System.out.println("The perimeter is " + perimeter + ".");
        return perimeter;
    }

    @Override
    public String toString() {
        var sentence = "Triangle: side1 = " + side1 + ", side 2 = " + side2 + ", side3 = " + side3;
        return sentence;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the first side.");
      	 double side1 = sc.nextDouble();
        System.out.println("Enter the length of the second side.");
      	 double side2 = sc.nextDouble();
        System.out.println("Enter the length of the third side.");
      	 double side3 = sc.nextDouble();
        System.out.println("Is this triangle filled? (Enter true or false)");
      	 boolean filled = sc.nextBoolean();
           String color = "";
        if (filled){
            System.out.println("What color is the triangle?");
          	 color = sc.next();
        } else {
             color = null;
        }
        Triangle triangle1 = new Triangle(side1, side2, side3, filled, color);
        triangle1.toString();
        triangle1.getArea();
        triangle1.getPerimeter();
    }
}
