public class Rectangle extends Shape {

        double length;
        double width;

        Rectangle(double l,double w){
            length=l;
            width=w;
        }

        @Override
        double CalcArea() {
            return length*width;
        }

        @Override
        double CalcPerimeter() {
            return 2*(length+width);
        }
    }


