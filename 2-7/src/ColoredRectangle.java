public class ColoredRectangle extends Rectangle {
    private String lineColor;
    private String fillColor;

    // Конструктор без параметрів
    public ColoredRectangle() {
        super();
        this.lineColor = "black";
        this.fillColor = "white";
    }

    // Конструктор з параметрами
    public ColoredRectangle(double width, double height, String lineColor, String fillColor) {
        super(width, height);
        this.lineColor = lineColor;
        this.fillColor = fillColor;
    }

    @Override
    public String toString() {
        return String.format(
            "ColoredRectangle [area=%.2f, perimeter=%.2f, lineColor=%s, fillColor=%s]",
            calculateArea(), calculatePerimeter(), lineColor, fillColor
        );
    }
}
