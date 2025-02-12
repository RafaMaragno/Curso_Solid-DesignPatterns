// SOLID - Open/Closed Principle (OCP)
abstract class Shape {
    double calculateArea();
}

class Circle extends Shape {
    double radius;
    Circle(this.radius);

    @override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape {
    double side;
    Square(this.side);

    @override
    double calculateArea() {
        return side * side;
    }
}

class AreaCalculator {
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}