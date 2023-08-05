import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);
        //already in database
        student s1 = new student();
        s1.stID= 1;
        s1.name= "Maryam";
        s1.phone = " 33456";
        student s2 = new student();
        s2.stID= 2;
        s2.name= "Ebtihal";
        s2.phone = "888733";
        student s3 = new student();
        s3.stID= 3;
        s3.name= "Safa";
        s3.phone = "22388";
        student s4 = new student();
        s4.stID= 4;
        s4.name= "Shahad";
        s4.phone = "00036635";
        student s5 = new student();
        s5.stID= 5;
        s5.name= "Huda";
        s5.phone = "00036635";


        //user input

        List<student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);


        while (true) {
            System.out.println(" Enter 1= attendance register, 2 = show attendance list, 3 = exit ");
            int x = read.nextInt();
            if (x == 1) {
                System.out.println("Enter your name : ");
                String name = read.next();
                if (
                        s1.name.equals(name)
                                || s2.name.equals(name)
                                || s3.name.equals(name)
                                || s4.name.equals(name)
                                || s5.name.equals(name)

                )
                {
                    System.out.println(" you are already registered !");
                }
                else {
                    System.out.println("Pleas enter your details for attendance: ");
                    System.out.println("Enter your ID : ");
                    student s = new student();
                    s.stID = read.nextInt();
                    System.out.println("Enter your name : ");
                    s.name = read.next();
                    System.out.println("Enter your phone number : ");
                    s.phone = read.next();
                    students.add(s);

                    for (int i = 0; i < students.size(); i++) {
                        System.out.print(students.get(i).stID+ "\t");
                        System.out.print(students.get(i).name + "\t");
                        System.out.println(students.get(i).phone + "\t");
                    }

                }


            } else if (x == 2) {
                for (int i = 0; i < students.size(); i++) {
                    System.out.print(students.get(i).stID + "\t");
                    System.out.print(students.get(i).name + "\t");
                    System.out.println(students.get(i).phone + "\t");
                }
            } else {

                System.out.println("you will exist , thank you !");
                break;
            }
        }















    }
}

