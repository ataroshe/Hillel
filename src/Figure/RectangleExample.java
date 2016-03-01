package Figure;

/**
 * Created by User on 26.02.2016.
 */
public class RectangleExample {
    public static void main(String[] args) {

        Rectangle firstRectangle = new Rectangle();
        firstRectangle.setHeigth(2);
        firstRectangle.setHeigth(3);
        firstRectangle.setColor("Blue");
        //int a = firstRectangle.heigth;

        int a = firstRectangle.calculateArea();

        System.out.println(a);
        System.out.println(firstRectangle.getColor());

        Rectangle secondRectangle = new Rectangle();
        secondRectangle.setHeigth(5);
        secondRectangle.setWidth(10);


        secondRectangle.calculateArea();

        int firstRectangleWidth = 3;
        int firstRectangleHeigth = 4;
        int secondRectangleWidth = 5;
        int secondRectangleHeight = 10;

        int area = calsulateArea(firstRectangleHeigth, secondRectangleWidth);
        area = calsulateArea(firstRectangle);

        System.out.println(area);

        firstRectangle.setWidth(4);

        System.out.println("the first rectangle is " + firstRectangle);

        Rectangle anotherRectangle = new Rectangle(firstRectangle.getWidth(), firstRectangle.getHeigth());

        System.out.println("the  another rect is: " + anotherRectangle.toString());

        System.out.println(firstRectangle == secondRectangle);
        System.out.println(firstRectangle.equals(anotherRectangle));

    }

    public static int calsulateArea(int height, int width) {
        return height * width;
    }

    public static int calsulateArea(Rectangle rectangle) {
        return rectangle.getHeigth() * rectangle.getWidth();
    }

}
