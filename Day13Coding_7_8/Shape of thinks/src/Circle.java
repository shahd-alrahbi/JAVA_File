public class Circle extends Shape {

        double radius;

        Circle(double r){
            radius=r;
        }

        @Override
        double CalcArea() {
            return Math.PI*radius*radius;
        }

        @Override
        double CalcPerimeter() {
            return 2*Math.PI*radius;
        }
    }

