package shapes;

import java.lang.Math;


public class Circle implements Ellipse {

    ClassPoint center;
    float lenghtCircle;
    float areaCircle;
    float r;

    public Circle(float cx, float cy, float r) {
        this.r = r;
        center = new ClassPoint(cx, cy);
    }

    public int getRotation() {
        return 0;
    }

    public float getLength() {
        float d;
        d = r * 2;
        lenghtCircle = (float) Math.PI * d;
        return lenghtCircle;
    }

    public float getArea() {
        areaCircle = (float) (Math.PI * Math.pow(r, 2));
        return areaCircle;
    }

    @Override
    public String toString() {

        return "center of the circle " + " cx = " + center.getX() + " cy= " + center.getY()
                + " radius " + r + " area " + getArea() + " length " + getLength();
    }
}


