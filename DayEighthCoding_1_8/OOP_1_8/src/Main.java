// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       student S=new student();
       S.name="salim";
       S.ID=12123;
       S.email="salim@gmail.com";
       S.phone="55648785";
       student.print();
       S.printName();
       S.printPhone();
       student.printID();



    }
}
class student {
    static int ID;
    String name;
    String email;
    String phone;

    static void print(){
        System.out.println("the information of student is :: ");
    }
    void printName(){
        System.out.println("welcome :  "+name);
    }
    void printPhone(){
        System.out.println("phone number :  " +phone);
    }

    void printEmail(){
        System.out.println("Email is  :  " +email);
    }
    static void printID(){
        System.out.println("ID : "+ ID);
    }


}
