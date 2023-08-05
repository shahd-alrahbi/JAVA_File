import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);

        while (true){

            System.out.println("Enter 0=paper , 1=rock , 2=scissor");
            int player1= read.nextInt();

            Random random=new Random();
            int player2= random.nextInt(2);
            System.out.println(player2);

            if(player1==player2){
                System.out.println("No Winner");
            }
            else if(player1==0 && player2==1 || player1==2 && player2==0 || player1==1 && player2==2){
                    System.out.println("player 1 is  Winner");
                }
                else {
                    System.out.println("player 2 is  Winner");
                }
            }

        }
    }
