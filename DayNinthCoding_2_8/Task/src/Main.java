import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);

          Courses c1=new Courses();
          c1.Course_name="Math";
          c1.Course_doctorName="Ali";
          c1.Course_code="MA112";
          c1.Course_hours=24;

         Courses c2=new Courses();
         c2.Course_name="Java Programming";
         c2.Course_doctorName="Amal";
         c2.Course_code="PH110";
         c2.Course_hours=90;

        Courses c3=new Courses();
        c3.Course_name="C++ Programming";
        c3.Course_doctorName="Huda";
        c3.Course_code="C910";
        c3.Course_hours=65;

        Courses c4=new Courses();
        c4.Course_name="Python Programming";
        c4.Course_doctorName="Ahmed";
        c4.Course_code="A910";
        c4.Course_hours=75;


        List<Courses> courses=new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);
        courses.add(c4);


        System.out.println("Chooses courses from hear "+"\n");

        for (int i = 0; i < Courses.size(); i++) {
            System.out.println("The course Name is : "+courses.get(i).Course_name);
            System.out.println("The  doctor course Name is :MR/MS "+courses.get(i).Course_doctorName + "\t");
            System.out.println("The course code is : "+courses.get(i).Course_code + "\t");
            System.out.println("The course hours is : "+courses.get(i).Course_hours + "\t");
            System.out.println("------------------------------");
        }

//          System.out.println("Enter what courses you went register");
//

    }
}

  class Courses {

      String Course_name;
      String Course_doctorName;
      String Course_code;
      int Course_hours;

      Courses(String name, String doctorName, String code, int hours) {
          Course_name = name;
          Course_doctorName = doctorName;
          Course_code = code;
          Course_hours = hours;
      }
      public static int size(){
          return 0;
      }

  }