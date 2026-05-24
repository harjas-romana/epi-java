// AGGREGATION EXAMPLE
// Demonstrates weak has-a relationship (whole-part relationship)

import java.util.ArrayList;
import java.util.List;

public class AggregationExample {

    static class Employee {
        private String name;
        private int employeeId;
        private double salary;

        public Employee(String name, int employeeId, double salary) {
            this.name = name;
            this.employeeId = employeeId;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }
    }

    static class Department {
        private String departmentName;
        private String manager;
        private List<Employee> employees;

        public Department(String departmentName, String manager) {
            this.departmentName = departmentName;
            this.manager = manager;
            this.employees = new ArrayList<>();
        }

        public void addEmployee(Employee employee) {
            employees.add(employee);
        }

        public void removeEmployee(Employee employee) {
            employees.remove(employee);
        }

        public double getTotalSalary() {
            double total = 0;
            for (Employee emp : employees) {
                total += emp.getSalary();
            }
            return total;
        }

        public void displayInfo() {
            System.out.println("Department: " + departmentName);
            System.out.println("Manager: " + manager);
            System.out.println("Employees:");
            for (Employee emp : employees) {
                System.out.println("  - " + emp.getName() + " ($" + emp.getSalary() + ")");
            }
            System.out.println("Total Salary: $" + getTotalSalary());
        }
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 1001, 50000);
        Employee emp2 = new Employee("Jane", 1002, 60000);
        Employee emp3 = new Employee("Jack", 1003, 55000);

        Department itDept = new Department("Information Technology", "Alice");
        itDept.addEmployee(emp1);
        itDept.addEmployee(emp2);
        itDept.addEmployee(emp3);

        itDept.displayInfo();
    }
}
