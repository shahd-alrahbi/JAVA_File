import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        2 - Problem: Pc Will Guess A number and the user will choose a number
//        then you will tell him if larger or less till he chooses the right number
//        Example:
//        Input: 5
//        Wrong Larger
//        15
//        Wrong Less
//        10
//        Right Answer
        Random rand=new Random();
        int numberofGuess=rand.nextInt(100)+1;
        Scanner read=new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100");
        while (true){
            int guess=read.nextInt();
            if(guess==numberofGuess){
                System.out.println("Right Answer");
                break;
            } else if (guess<numberofGuess) {
                System.out.println("wronged. The answer is larger than "+ guess + " Try Again");
            }
            else {
                System.out.println("wronged. The answer is less than "+ guess + " Try Again");
            }
        }

    }
}