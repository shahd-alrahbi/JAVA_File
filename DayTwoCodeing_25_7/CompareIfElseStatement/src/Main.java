import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        Scanner read=new Scanner(System.in);
        System.out.println("Activity1");
        System.out.println("Please Enter Number");
        int x=read.nextInt();
        System.out.println("Please Enter Number");
        int y=read.nextInt();
        System.out.println("Please Enter Number");
        int z=read.nextInt();

        if(x>y && x>z ){
            System.out.println("x is grater"+x);
        }
       else if(y>x && y>z){
            System.out.println("y is grater"+y);
        }
       else if (z>x && z>y){
            System.out.println("z is grater"+z);
        }
        else {
            System.out.println("Error");
        }
    }
}