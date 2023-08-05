// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee e=new Employee(5000,"shahad","98745612","shahd@gmail.com","Muscat");
       System.out.println(e.caleNetSalary());
    }
}
class Employee{
    Employee(){
        System.out.println("create new employee");
    }

    Employee(double s,String n,String p,String e,String a){
        name=n;
        salary=s;
        phone=p;
        address=a;
        email=e;
    }

    String name;
    String phone;
    double salary;
    String address;
    String email;


double caleNetSalary(){
    return  salary-(salary+.14);}

    void printName(){
        System.out.println("Hello, Ms/Mrs"+name+"Your email is :"+email+"your phone is "+phone);
    }
    void printAddress(){
        System.out.println("Your address is :"+address);
    }

}



