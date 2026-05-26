// MVC PATTERN EXAMPLE
// Demonstrates Model-View-Controller architectural pattern

public class MVCPatternExample {

    // MODEL - Data and business logic
    static class StudentModel {
        private String name;
        private String email;
        private double gpa;

        public StudentModel(String name, String email, double gpa) {
            this.name = name;
            this.email = email;
            this.gpa = gpa;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
    }

    // VIEW - Presentation logic
    static class StudentView {
        public void displayStudent(StudentModel student) {
            System.out.println("Student Information:");
            System.out.println("Name: " + student.getName());
            System.out.println("Email: " + student.getEmail());
            System.out.println("GPA: " + student.getGpa());
        }

        public void displayMessage(String message) {
            System.out.println(message);
        }
    }

    // CONTROLLER - Business logic and coordination
    static class StudentController {
        private StudentModel model;
        private StudentView view;

        public StudentController(StudentModel model, StudentView view) {
            this.model = model;
            this.view = view;
        }

        public void setStudentName(String name) {
            model.setName(name);
        }

        public void setStudentEmail(String email) {
            model.setEmail(email);
        }

        public void setStudentGpa(double gpa) {
            if (gpa >= 0 && gpa <= 4.0) {
                model.setGpa(gpa);
            } else {
                view.displayMessage("Invalid GPA!");
            }
        }

        public void updateView() {
            view.displayStudent(model);
        }
    }

    public static void main(String[] args) {
        // Create model and view
        StudentModel model = new StudentModel("John Doe", "john@example.com", 3.5);
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(model, view);

        System.out.println("=== Initial Student Data ===");
        controller.updateView();

        System.out.println("\n=== Updating Student Data ===");
        controller.setStudentName("Jane Doe");
        controller.setStudentEmail("jane@example.com");
        controller.setStudentGpa(3.8);

        controller.updateView();

        System.out.println("\n=== Attempting Invalid GPA ===");
        controller.setStudentGpa(5.0);
    }
}
