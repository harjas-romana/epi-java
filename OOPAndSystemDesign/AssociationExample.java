// ASSOCIATION EXAMPLE
// Demonstrates has-a relationship between objects

public class AssociationExample {

    static class Student {
        private String name;
        private int studentId;
        private Course enrolledCourse;

        public Student(String name, int studentId) {
            this.name = name;
            this.studentId = studentId;
        }

        public void enrollCourse(Course course) {
            this.enrolledCourse = course;
        }

        public void displayInfo() {
            System.out.println("Student: " + name + " (ID: " + studentId + ")");
            if (enrolledCourse != null) {
                System.out.println("Enrolled in: " + enrolledCourse.getName());
            }
        }
    }

    static class Course {
        private String name;
        private String courseCode;
        private int credits;

        public Course(String name, String courseCode, int credits) {
            this.name = name;
            this.courseCode = courseCode;
            this.credits = credits;
        }

        public String getName() {
            return name;
        }

        public String getCourseCode() {
            return courseCode;
        }

        public int getCredits() {
            return credits;
        }
    }

    public static void main(String[] args) {
        Course javaCourse = new Course("Advanced Java", "CS301", 4);
        Course pythonCourse = new Course("Python Programming", "CS201", 3);

        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);

        student1.enrollCourse(javaCourse);
        student2.enrollCourse(pythonCourse);

        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
    }
}
