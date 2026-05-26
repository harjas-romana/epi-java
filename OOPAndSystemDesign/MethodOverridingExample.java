// METHOD OVERRIDING EXAMPLE
// Demonstrates runtime (dynamic) polymorphism

public class MethodOverridingExample {

    static class Vehicle {
        public void start() {
            System.out.println("Vehicle is starting...");
        }

        public void stop() {
            System.out.println("Vehicle is stopping...");
        }

        public void display() {
            System.out.println("This is a vehicle");
        }
    }

    static class Car extends Vehicle {
        @Override
        public void start() {
            System.out.println("Car is starting with an engine roar...");
        }

        @Override
        public void stop() {
            System.out.println("Car is stopping with brakes applied...");
        }

        @Override
        public void display() {
            System.out.println("This is a car");
        }

        public void openTrunk() {
            System.out.println("Opening car trunk");
        }
    }

    static class Bike extends Vehicle {
        @Override
        public void start() {
            System.out.println("Bike is starting with a kick...");
        }

        @Override
        public void stop() {
            System.out.println("Bike is stopping quickly...");
        }

        @Override
        public void display() {
            System.out.println("This is a bike");
        }

        public void doWheelie() {
            System.out.println("Doing a wheelie!");
        }
    }

    public static void main(String[] args) {
        // Creating objects
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bike bike = new Bike();

        System.out.println("=== Polymorphism in Action ===");

        // Reference of parent class pointing to child class objects
        Vehicle ref;

        ref = vehicle;
        ref.display();
        ref.start();
        ref.stop();

        System.out.println();

        ref = car;
        ref.display();
        ref.start();
        ref.stop();

        System.out.println();

        ref = bike;
        ref.display();
        ref.start();
        ref.stop();

        System.out.println();

        // Accessing child-specific methods
        car.openTrunk();
        bike.doWheelie();
    }
}
