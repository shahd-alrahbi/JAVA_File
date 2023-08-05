public class Course {

        String name;
        String doctorName;
        String code;
        int hours;

        public Course(String name, String doctorName, String code, int hours) {
            this.name = name;
            this.doctorName = doctorName;
            this.code = code;
            this.hours = hours;
        }

        public String getName() {
            return name;
        }

        public String getDoctorName() {
            return doctorName;
        }

        public String getCode() {
            return code;
        }

        public int getHours() {
            return hours;
        }

        @Override
        public String toString() {
            return "Course Name: " + name + ", Doctor Name: " + doctorName + ", Code: " + code + ", Hours: " + hours;
        }
    }

