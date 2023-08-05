import java.util.ArrayList;
import java.util.List;

public class Student {

         String name;
         int id;
         List<Course> courses;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
            courses = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public List<Course> getCourses() {
            return courses;
        }

        public void setCourses(List<Course> courses) {
            this.courses = courses;
        }

        @Override
        public String toString() {
            return "Student Name: " + name + ", ID: " + id + ", Courses: " + courses.size();
        }

    public static void registerCourse(Course course){
//
   }
    }

