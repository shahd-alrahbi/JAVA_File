import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        System.out.println("Activity3");
        System.out.println("Please Enter Number");
        int x=read.nextInt();
        System.out.println("Please Enter Number");
        int y=read.nextInt();
        System.out.println("Please chose operator +, -,/,*");

        String op=read.next();

        if(op.equals("*")){
            System.out.println("The result  "+(x*y));
        }
        else if (op.equals("+") ){
            System.out.println("The result  "+(x+y));
        }
        else if (op.equals("/")){
            System.out.println("The result  "+(x/y));
        }
        else if (op.equals("-")){
            System.out.println("The result  "+( x-y));
        }
    }
}