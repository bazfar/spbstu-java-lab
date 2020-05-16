package shapes;


public class Triangle implements Shape, Polygon {

    ClassPoint right;
    ClassPoint left;
    ClassPoint up;
    float leftRight;
    float leftUp;
    float rightUp;
    float p = 0;

    public Triangle(float rx, float ry, float lx, float ly, float ux, float uy) {
        right = new ClassPoint(rx, ry);
        left = new ClassPoint(lx, ly);
        up = new ClassPoint(ux, uy);

        leftRight = (float) (Math.sqrt((Math.pow(Math.abs(rx - lx), 2)) + (Math.pow(Math.abs(ry - ly), 2))));
        leftUp = (float) (Math.sqrt((Math.pow(Math.abs(ux - lx), 2)) + (Math.pow(Math.abs(uy - ly), 2))));
        rightUp = (float) (Math.sqrt((Math.pow(Math.abs(rx - ux), 2)) + (Math.pow(Math.abs(ry - uy), 2))));
    }

    public float getArea() {

        p = (leftRight + leftUp + rightUp) / 2;
        float s;
        s = (float) Math.sqrt(p * (p - leftRight) * (p - leftUp) * (p - rightUp));
        return s;
    }

    public int getRotation() {
        return 0;
    }

    public float getPerimeter() {

        return p = (leftRight + leftUp + rightUp);
    }

    @Override
    public String toString() {

        return " coordinates of triangle " + right.getX() + " " + right.getY()
                + " and left  " + left.getX() + " " + left.getY() + " and up  " + up.getX() + " " + up.getY() + " , Perimeter "
                + getPerimeter() + " and area " + getArea();

    }
}


