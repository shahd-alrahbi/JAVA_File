// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        Doveloper dev=new Employee();
//        Employee dev=new Doveloper ();
//
//        Employee e=new Employee();
//        e.salary=5000;
//        e.name="Shahd khalifa";
//       System.out.println(e.calcNetSalary());

        Doveloper dev=new Doveloper();
        dev.name="Shahd";
        dev.hoursRate=50;

    }
}
class Employee{
    String name;
    double salary;
    double calcNetSalary(){
        return salary-(salary*.14);
    }
}

class Doveloper extends Employee{
    double hoursRate;
    int hoursRe;
    double calcNetSalary(){
//        return super.calcNetSalary();
        return hoursRate*hoursRe;
    }
}