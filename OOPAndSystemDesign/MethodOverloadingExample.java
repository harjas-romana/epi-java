// METHOD OVERLOADING EXAMPLE
// Demonstrates compile-time (static) polymorphism

public class MethodOverloadingExample {

    // Overloaded method - different parameter types
    public static void add(int a, int b) {
        System.out.println("Adding integers: " + (a + b));
    }

    public static void add(double a, double b) {
        System.out.println("Adding doubles: " + (a + b));
    }

    public static void add(String a, String b) {
        System.out.println("Concatenating strings: " + (a + b));
    }

    // Overloaded method - different number of parameters
    public static void add(int a, int b, int c) {
        System.out.println("Adding three integers: " + (a + b + c));
    }

    // Overloaded method - different order of parameters
    public static void process(int a, String b) {
        System.out.println("Processing int and String: " + a + ", " + b);
    }

    public static void process(String a, int b) {
        System.out.println("Processing String and int: " + a + ", " + b);
    }

    // Method with varargs
    public static void printNumbers(int... numbers) {
        System.out.print("Numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Method overloading based on parameter type
        add(5, 10);
        add(5.5, 10.5);
        add("Hello", " World");

        System.out.println();

        // Method overloading based on number of parameters
        add(5, 10, 15);

        System.out.println();

        // Method overloading based on parameter order
        process(10, "Test");
        process("Test", 20);

        System.out.println();

        // Varargs
        printNumbers(1, 2, 3, 4, 5);
        printNumbers(10, 20);
    }
}
