package shapes;

public class Rectangle extends Shape {
    private double width, length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getArea() { return width * length; }
    public double getPerimeter() { return 2 * (width + length); }
    public double getWidth() { return width; }
    public double getLength() { return length; }

    public String toString() {
        return "[ Rectangle ]\n" + super.toString() + "\n" +
               "Width : " + width + "\n" +
               "Length: " + length + "\n" +
               "Area      : " + String.format("%.2f", getArea()) + "\n" +
               "Perimeter : " + String.format("%.2f", getPerimeter());
    }
}
