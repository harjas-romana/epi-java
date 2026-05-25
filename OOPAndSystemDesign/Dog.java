// INHERITANCE EXAMPLE - Derived Class
// Extends Animal class

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age, "Canine");
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " barks: Woof! Woof!");
    }

    @Override
    public void move() {
        System.out.println(name + " runs on all fours");
    }

    public void fetch() {
        System.out.println(name + " fetches the ball happily");
    }

    public String getBreed() {
        return breed;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}
