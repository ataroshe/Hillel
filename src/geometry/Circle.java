package geometry;

public class Circle {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void circleArea() {
        area = Math.PI * (Math.pow(radius, 2));
    }

    public double getArea() {
        return area;
    }
}
