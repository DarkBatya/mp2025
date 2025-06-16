public class Main {
    public static void main(String[] args) {
        Rectangle[] shapes = new Rectangle[] {
            new Rectangle(2.0, 3.0),
            new ColoredRectangle(2.0, 3.0, "red", "yellow"),
            new Rectangle(4.5, 1.5),
            new ColoredRectangle(4.5, 1.5, "blue", "green")
        };

        // Динамічний поліморфізм — один виклик println демонструє різні реалізації toString()
        for (Rectangle r : shapes) {
            System.out.println(r);
        }
    }
}
