import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Problem: Implement pow(x, n), which calculates x raised to the power n (x^n).
//                Example:
//        Input: x = 2.00000, n = 10
//        Output: 1024.00000

        Scanner read=new Scanner(System.in);
        System.out.println("Pleas Enter Number :");
        double num=read.nextDouble();

        System.out.println("Pleas Enter Power :");
        int power= read.nextInt();

        System.out.println("Result = "+(Math.pow(num,power)));


    }
}