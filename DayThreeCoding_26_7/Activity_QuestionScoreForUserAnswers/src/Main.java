import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

         int score=0;
        Scanner read=new Scanner(System.in);
        System.out.println("Enter the student name");
        String name= read.next();
        System.out.println("Enter the questions Number ");
        int namber= read.nextInt();

        String [] questions= {
                "Question1 __ Find answer 2*2=",
                "Question2 __ Find answer 2+2=",
                "Question3 __ Find answer 2-2=",
                "Question4 __ Find answer 10/2=",
                "Question5 __ Find answer 8-2="};


        double[] answer= {4,4,0,5,6};

        for (int i = 0;i<questions.length; i++){
            System.out.println(questions[i]);
            double a = read.nextDouble();
            if (a == answer[i]){
                System.out.println("correct" );
                score++;

            }else{
                System.out.println("wrong answer");
                System.out.println("right answer is : " + answer[i] );
            }
            System.out.println("your score is" +score);
        }

    }
}