// Enter code here
package shapes;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {

        Scanner Mahmud = new Scanner(System.in);


        int n = Mahmud.nextInt();


        Shape[] shapes = new Shape[n];


        for (int i = 0; i < n; i++) {
            String type   = Mahmud.next();
            String color  = Mahmud.next();
            boolean filled = Mahmud.nextBoolean();

            if (type.equals("RECTANGLE")) {
                double width  = Mahmud.nextDouble();
                double length = Mahmud.nextDouble();
                shapes[i] = new Rectangle(color, filled, width, length);

            } else if (type.equals("CIRCLE")) {
                double radius = Mahmud.nextDouble();
                shapes[i] = new Circle(color, filled, radius);
            }
        }


        for (Shape s : shapes) {
            System.out.println(s);
            System.out.println();
        }


        System.out.println("--- Downcast Check ---");
        for (Shape s : shapes) {
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                System.out.println("Rectangle width="  + r.getWidth()
                        + " length=" + r.getLength());
            } else if (s instanceof Circle) {
                Circle c = (Circle) s;
                System.out.println("Circle radius=" + c.getRadius());
            }
        }
        // ── TASK 6 — Abstract class (written answer) ──────────
        // What error does the compiler give if you write:
        //     Shape s = new Shape("Red", true);
        //
        // ANSWER: error: Shape is abstract; cannot be instantiated
        // The compiler refuses to instantiate an abstract class directly
        // because Shape has abstract methods (getArea, getPerimeter)
        // with no implementation. You must instantiate a concrete subclass.
        Mahmud.close();
    }
}
