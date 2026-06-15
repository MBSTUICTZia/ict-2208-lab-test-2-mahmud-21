package shapes;

import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Shape[] shapes = new Shape[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String color = sc.next();
            boolean filled = sc.nextBoolean();

            if (type.equalsIgnoreCase("RECTANGLE")) {
                shapes[i] = new Rectangle(color, filled, sc.nextDouble(), sc.nextDouble());
            } else {
                shapes[i] = new Circle(color, filled, sc.nextDouble());
            }
        }

        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println();
        }

        System.out.println("--- Downcast Check ---");
        for (Shape s : shapes) {
            if (s instanceof Rectangle r) {
                System.out.println("Rectangle width=" + r.getWidth() + " length=" + r.getLength());
            } else if (s instanceof Circle c) {
                System.out.println("Circle radius=" + c.getRadius());
            }
        }
        sc.close();
    }
}
