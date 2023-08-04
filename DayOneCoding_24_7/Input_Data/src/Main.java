import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //________________PART 2 INPUT DATA__________________

//        Scanner read=new Scanner(System.in);
//        System.out.println("Please Enter Your Name");
//        String name = read.next();
//        System.out.println("Welcome  "+ name);
//
//        int x=read.nextInt();
//
//
//        System.out.println("_________________________________________________");

        //________________Activity1__________________
//        System.out.println("Welcome our system");
//        System.out.println("Please Enter Your Name");
//        String Name = read.next();
//        System.out.println("Please Enter Your Age");
//        int X=read.nextInt();
//        int age=100-X;
//        System.out.println("you have "+ age +"  year");

//        System.out.println("_________________________________________________");
//        ________________Activity2__________________
         Scanner read=new Scanner(System.in);
         System.out.println("Welcome our system");
         System.out.println("Please Enter Number");
         double x=read.nextDouble();
         System.out.println("Please Enter Number");
         double y=read.nextDouble();
         double result=x+y ;
         double result1=x-y ;
         double result2=x*y ;
         double result3=x/y ;
         System.out.println("Your result " + result );
         System.out.println("Your result " +result1);
         System.out.println("Your result " +result2);
         System.out.println("Your result " +result3);


    }
}