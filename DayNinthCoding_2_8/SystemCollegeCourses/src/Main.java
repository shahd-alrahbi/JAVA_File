import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


 class CollegeSystem {
   List<Course> courses;
   List<Student> students;

    public CollegeSystem() {
        courses = new ArrayList<>();
        students = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
//        System.out.println("Course added successfully!");
    }

    public void registerStudent(Student student) {
        students.add(student);
        System.out.println("Student registered successfully!");
    }

    public void displayCourses() {
//        if (courses.isEmpty()) {
//            System.out.println("No courses found.");
//        } else {
//            System.out.println("Courses:");
//            for (Course course : courses) {
//                System.out.println(course);
//            }
//        }
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
        } else {
            System.out.println("Courses:");
            for (Course course : courses) {
                System.out.println(course);
                int numStudentsRegistered = 0;
                for (Student student : students) {
                    if (student.getCourses().contains(course)) {
                        numStudentsRegistered++;
                    }
                }
                System.out.println("Number of Students Registered: " + numStudentsRegistered);
            }
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("Students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        CollegeSystem college = new CollegeSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Define some courses
        Course course1 = new Course("Mathematics", "Dr. Amal", "MATH101", 4);
        Course course2 = new Course("Physics", "Dr. Adams", "PHYS201", 3);
        Course course3 = new Course("JAVA PROGRAMMING", "Dr. Salim", "JAVA101", 3);

        college.addCourse(course1);
        college.addCourse(course2);
        college.addCourse(course3);

        while (true) {
            System.out.println("\nCollege System");
            System.out.println("1. Register a student");
            System.out.println("2. Display all courses");
            System.out.println("3. Display all students");
            System.out.println("4. Quit");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the student name: ");
                    String studentName = scanner.nextLine();
                    System.out.print("Enter the student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();

                    Student student = new Student(studentName, studentId);
                    college.registerStudent(student);

                    // Student chooses courses
                    college.displayCourses();
                    System.out.println("Enter the course codes to register (separated by commas): ");
                    String[] courseCodes = scanner.nextLine().split(",");
                    for (String code : courseCodes) {
                        for (Course c : college.courses) {
                            if (c.getCode().equals(code.trim())) {
                                Student.registerCourse(c);
                                break;
                            }
                        }
                    }
                    break;
                case 2:
                    college.displayCourses();
                    break;
                case 3:
                    college.displayStudents();
                    break;
                case 4:
                    System.out.println("Exiting the College System.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}