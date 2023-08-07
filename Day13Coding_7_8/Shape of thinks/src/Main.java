public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println(" The Area  of Circle is : "+circle.CalcArea() );
        System.out.println("Circle Perimeter: "+circle.CalcPerimeter());
        System.out.println("\n ");
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("The Area of Rectangle: " +rectangle.CalcArea());
        System.out.println("The Perimeter of Rectangle : "+rectangle.CalcPerimeter() );
        System.out.println("\n ");
        Triangle triangle = new Triangle(1/2,2,2,3,3);
        System.out.println("The Area of Triangle : "+triangle.CalcArea());
        System.out.println("The Perimeter of Triangle : "+triangle.CalcPerimeter());
    }
}

    abstract class Shape {
    abstract double CalcArea();
    abstract double CalcPerimeter();
}




