import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class SalaryManagement {
    String[] names;
    double[] salaries;
    int employeeCount;

    public SalaryManagement() {
        names = new String[100]; // Assuming a maximum of 100 employees
        salaries = new double[100];
        employeeCount = 0;
    }

    public void createEmployee() {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the name of the employee: ");
        String name = read.nextLine();

        System.out.print("Enter the salary of the employee: ");
        double salary = read.nextDouble();

        names[employeeCount] = name;
        salaries[employeeCount] = salary;
        employeeCount++;

        System.out.println("Employee created successfully!");
    }

    public void displaySalaries() {
        if (employeeCount == 0) {
            System.out.println("No employees found.");
        } else {
            System.out.println("Employee Salaries:");
            for (int i = 0; i < employeeCount; i++) {
                String name = names[i];
                double salary = salaries[i];
                System.out.println(name + ": " + salary);
            }
        }
    }

    public static void main(String[] args) {
        SalaryManagement sms = new SalaryManagement();

        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("\nSalary Management System");
            System.out.println("1. Create a new employee and assign salary");
            System.out.println("2. Display all salaries with employee names");
            System.out.println("3. Quit");

            System.out.print("Enter your choice (1, 2, or 3): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    sms.createEmployee();
                    break;
                case 2:
                    sms.displaySalaries();
                    break;
                case 3:
                    System.out.println("Exiting the Salary Management System.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}