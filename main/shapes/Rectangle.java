package shapes;


public class Rectangle implements Shape, Polygon {

    ClassPoint rightup;
    ClassPoint leftdown;
    float height;
    float length;

    public Rectangle(float rx, float ry, float lx, float ly) {
        rightup = new ClassPoint(rx, ry);
        leftdown = new ClassPoint(lx, ly);

        height = Math.abs(ry - ly);

        length = Math.abs(rx - lx);
    }

    public float getArea() {
        float area = height * length;

        return area;
    }

    public float getPerimeter() {
        float perimeter = 2 * height + 2 * length;
        return perimeter;
    }

    public int getRotation() {

        return 0;
    }

    @Override
    public String toString() {

        return " cordinates of rectangle  " + rightup.getX() + " " + rightup.getY()
                + " and " + leftdown.getX() + " " + leftdown.getY() + " , perimeter "
                + getPerimeter() + " area " + getArea();

    }
}

