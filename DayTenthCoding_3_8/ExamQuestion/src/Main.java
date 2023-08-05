import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);

        String[] an1={"2","5","7","6"};
        Question q1=new Question("1 + 1","2",1,an1);

        String[] an2={"2","5","7","6"};
        Question q2=new Question("10 * 5","50",3,an2);

        String[] an3={"2","5","7","6"};
        Question q3=new Question("10 % 5","0",5,an3);

        List<Question> questions=new ArrayList<>();
        questions.add(q1);
        questions.add(q2);
        questions.add(q3);

        double total=0;
        for(Question q:questions){
            q.displayQuestion();
            String UserAnswer= read.next();
            if(UserAnswer.equals(q.rightAnswer)){
                total+=q.degree;
            }
        }

        System.out.println("Your degree is : "+ total);
    }
}

class Question{
    String text;
    String rightAnswer;
    double degree;

    String[] answers;

    Question(String t,String r,double d,String[]an){
        text=t;
        degree=d;
        rightAnswer=r;
        answers=an;
    }

    void displayQuestion(){
        System.out.println("Question :"+text+ " ? ");
        for (String a:answers){
            System.out.println("\n"+a);
        }
        System.out.println();
    }
}