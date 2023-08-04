import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //use if else statement for input user correct answer
        Scanner read= new Scanner(System.in);
        System.out.println("Find the solution of the first question 2+2= :");
        int q1=read.nextInt();
        if(q1==4){
            System.out.println("Your answer is correct");
        }
        else{
            System.out.println("Your answer is wrong try again");
        }
        System.out.println("Find the solution of the second question 3*5= :");
        int q2=read.nextInt();
        if(q2==15){
            System.out.println("Your answer is correct");
        }
        else{
            System.out.println("Your answer is wrong try again");
        }
        System.out.println("Find the solution of the third question 10-6= :");
        int q3=read.nextInt();
        if(q3==4){
            System.out.println("Your answer is correct");
        }
        else{
            System.out.println("Your answer is wrong try again");
        }

    }
}