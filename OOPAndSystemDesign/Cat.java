// INHERITANCE EXAMPLE - Derived Class
// Extends Animal class

public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age, "Feline");
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " meows: Meow! Meow!");
    }

    @Override
    public void move() {
        System.out.println(name + " walks gracefully on all fours");
    }

    public void scratch() {
        System.out.println(name + " scratches the furniture");
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Indoor: " + isIndoor);
    }
}
