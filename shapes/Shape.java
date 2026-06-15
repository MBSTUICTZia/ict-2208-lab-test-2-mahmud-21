package shapes;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public String toString() {
        return "Color : " + color + "\nFilled: " + (filled ? "Yes" : "No");
    }
