package geometry;

public class Rectangle {
    private double x;
    private double y;
    private double area;
    private double perimeter;

    public Rectangle(double area, double perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public void rectangleSides() {
        double x1 = -((-perimeter / 2) - Math.sqrt(Math.pow((perimeter / 2), 2) - 4 * 1 * area)) / 2;
        double x2 = -((-perimeter / 2) + Math.sqrt(Math.pow((perimeter / 2), 2) - 4 * 1 * area)) / 2;
        x = x1;
        y = x2;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
