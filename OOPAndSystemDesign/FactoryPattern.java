// FACTORY PATTERN
// Provides an interface for creating objects without specifying their exact classes

public class FactoryPattern {

    public static Shape createShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle(5.0);
            case "rectangle":
                return new Rectangle(10.0, 5.0);
            case "triangle":
                return new Triangle(3.0, 4.0, 5.0);
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }

    // Demo
    public static void main(String[] args) {
        Shape circle = FactoryPattern.createShape("circle");
        circle.displayInfo();
        System.out.println();

        Shape rectangle = FactoryPattern.createShape("rectangle");
        rectangle.displayInfo();
        System.out.println();

        Shape triangle = FactoryPattern.createShape("triangle");
        triangle.displayInfo();
    }
}
