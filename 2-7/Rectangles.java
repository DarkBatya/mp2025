public class Rectangles {
    // Поля класу: ширина та висота
    private double width;
    private double height;

    // Конструктор без параметрів (за замовчуванням)
    public Rectangles() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // Конструктор з параметрами
    public Rectangles(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Гетер для ширини
    public double getWidth() {
        return width;
    }

    // Сетер для ширини
    public void setWidth(double width) {
        this.width = width;
    }

    // Перевантажений сетер з перевіркою
    public void setWidth(double width, boolean positiveOnly) {
        if (positiveOnly && width <= 0) {
            throw new IllegalArgumentException("Ширина має бути додатньою.");
        }
        this.width = width;
    }

    // Гетер для висоти
    public double getHeight() {
        return height;
    }

    // Сетер для висоти
    public void setHeight(double height) {
        this.height = height;
    }

    // Перевантажений сетер з перевіркою
    public void setHeight(double height, boolean positiveOnly) {
        if (positiveOnly && height <= 0) {
            throw new IllegalArgumentException("Висота має бути додатньою.");
        }
        this.height = height;
    }

    // Метод для обчислення площі
    public double calculateArea() {
        return width * height;
    }

    // Перевантажений метод обчислення площі з масштабуванням
    public double calculateArea(double scaleFactor) {
        return (width * scaleFactor) * (height * scaleFactor);
    }

    // Метод для обчислення периметра
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    // Перевантажений метод обчислення периметра з масштабуванням
    public double calculatePerimeter(double scaleFactor) {
        return 2 * ((width * scaleFactor) + (height * scaleFactor));
    }

    @Override
    public String toString() {
        return String.format("Rectangle [width=%.2f, height=%.2f]", width, height);
    }

    // Доданий метод main для демонстрації
    public static void main(String[] args) {
        // Демонстрація роботи класу
        Rectangles r1 = new Rectangles();               // 1×1
        Rectangles r2 = new Rectangles(3.5, 2.0);       // 3.5×2.0

        System.out.println(r1);
        System.out.println("Area = " + r1.calculateArea());
        System.out.println("Perimeter = " + r1.calculatePerimeter());

        System.out.println(r2);
        System.out.println("Scaled Area (×2) = " + r2.calculateArea(2.0));
        System.out.println("Scaled Perimeter (×2) = " + r2.calculatePerimeter(2.0));
    }
}
