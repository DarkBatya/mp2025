public class Rectangle {
    private double width;
    private double height;

    // Конструктор без параметрів (за замовчуванням)
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // Конструктор з параметрами
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format(
            "Rectangle [area=%.2f, perimeter=%.2f]",
            calculateArea(), calculatePerimeter()
        );
    }
}

