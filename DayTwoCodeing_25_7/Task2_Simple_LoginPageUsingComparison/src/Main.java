import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Scanner read=new Scanner(System.in);
        System.out.println("Task2");
        System.out.println("Login Page");
        String email="shahd@gmai.com";
        System.out.println("Enter Your email :");
        String email1=read.next();
        String password="sh1234";
        System.out.println("Enter Your password :");
        String password1=read.next();
        if (email.equals(email1)&&(password.equals(password1))) {
            System.out.println("login Successfully ");
        } else {
            System.out.println("sorry Login Failed");
        }
    }
}