import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);

        System.out.println("Activity2");
        System.out.println("Please Enter tha mark1");
        int x=read.nextInt();
        System.out.println("Please Enter tha mark2");
        int y=read.nextInt();
        System.out.println("Please Enter tha mark3");
        int z=read.nextInt();
        System.out.println("Please Enter tha mark4");
        int f=read.nextInt();
        System.out.println("Please Enter tha mark5");
        int d=read.nextInt();

        int total= (x+y+z+f+d)/5;
        if(total >=90){
            System.out.println("Your Grade is A  "+total);
        }
        else if((total >=80) && (total<=89)){
            System.out.println("Your Grade is B  "+total);
        }
        else if((total >=70) && (total<=79)){
            System.out.println("Your Grade is C  "+total);
        }
        else if((total >=60) && (total<=69)){
            System.out.println("Your Grade is D  "+total);
        }
        else{
            System.out.println("Failed"+total);
        }

    }
}