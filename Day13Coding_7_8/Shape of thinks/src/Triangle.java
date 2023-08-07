public class Triangle extends Shape{

        double R1;
        double R2;
        double R3;
        double base;
        double height;

        Triangle(double r1,double r2,double r3,double b,double h){
            R1=r1;
            R2=r2;
            R3=r3;
            base = b;
            height=h;
        }
        @Override
        double CalcArea() {
            return ( base*height) / 2;
        }

        @Override
        double CalcPerimeter() {
            return R1+R2+R3+base+height;
        }
    }



