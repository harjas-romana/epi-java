// INHERITANCE EXAMPLE - Base Class
// Demonstrates inheritance hierarchy

public abstract class Animal {
    protected String name;
    protected int age;
    protected String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    public abstract void makeSound();

    public abstract void move();

    public void eat() {
        System.out.println(name + " is eating...");
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Species: " + species);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
