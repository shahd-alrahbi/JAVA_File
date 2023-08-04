import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        
        Scanner read=new Scanner(System.in);
        System.out.println("Task2");
        System.out.println("Please Enter Number");
        double x=read.nextDouble();
        System.out.println("Please Enter Number");
        double y=read.nextDouble();
        System.out.println("Please Enter Number");
        double z=read.nextDouble();
        double Average= ((x+y+z)/3);
        System.out.println("  The Average ="+Average);
    }
}