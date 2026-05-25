// DECORATOR PATTERN
// Attaches additional responsibilities to an object dynamically

interface Vehicle {
    void assemble();
}

class BasicCar implements Vehicle {
    @Override
    public void assemble() {
        System.out.println("Basic car assembled");
    }
}

abstract class CarDecorator implements Vehicle {
    protected Vehicle vehicle;

    public CarDecorator(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void assemble() {
        vehicle.assemble();
    }
}

class SunRoof extends CarDecorator {
    public SunRoof(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sun roof");
    }
}

class SportWheels extends CarDecorator {
    public SportWheels(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sport wheels");
    }
}

class ACSystem extends CarDecorator {
    public ACSystem(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding AC system");
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        Vehicle basicCar = new BasicCar();
        basicCar.assemble();

        System.out.println();

        Vehicle carWithSunRoof = new SunRoof(new BasicCar());
        carWithSunRoof.assemble();

        System.out.println();

        Vehicle luxuryCar = new ACSystem(new SportWheels(new SunRoof(new BasicCar())));
        luxuryCar.assemble();
    }
}
