import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        System.out.println("Task3");
        System.out.println("Registration Page");
        System.out.println("Enter Your Name :");
        String name=read.next();
        System.out.println("Enter Your email :");
        String email=read.next();
        System.out.println("Enter Your Phone :");
        int phone=read.nextInt();
        //BOD
        System.out.println("Enter Your BOD of year :");
        int year=read.nextInt();
        System.out.println("Enter your BOD month : ");
        int month =read.nextInt();
        System.out.println("Enter your BOD day : ");
        int day =read.nextInt();
        //password
        System.out.println("Enter Your password :");
        String password=read.next();
        System.out.println("Enter Your confirm_password :");
        String confirm_password=read.next();
        if (password.equals(confirm_password)) {
            System.out.println("Your Account is ready  " + " And Your birthday is " + year + "-" + month + "-" + day);
        } else {
            System.out.println("Password and confirm_password do not match.");
        }
    }
}