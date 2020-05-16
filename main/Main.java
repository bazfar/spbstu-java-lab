import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Triangle;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];

        shapes[0] = new Rectangle(10, 10, 40, 20);
        shapes[1] = new Circle(68, 72, 10);
        shapes[2] = new Triangle(5, 7, 7, 6, 2, 3);
        shapes[3] = new Rectangle(5, 5, 20, 10);
        shapes[4] = new Circle(68, 72, 5);
        shapes[5] = new Triangle(5, 75, 75, 64, 27, 35);
        shapes[6] = new Circle(72, 23, 14);
        shapes[7] = new Rectangle(15, 15, 60, 20);
        shapes[8] = new Triangle(24, 46, 92, 29, 74, 13);
        shapes[9] = new Circle(6, 8, 5);
        for (int i = 0; i < 10; i++) {
            System.out.println(shapes[i]);
            System.out.println("");
        }
        float a = shapes[0].getArea();
        for (int i = 0; i < 10; i++) {

            if (shapes[i].getArea() > a) {
                a = shapes[i].getArea();
            }
        }
        System.out.println(" max area " + a);

    }
}