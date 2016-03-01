package Figure;

/**
 * Created by User on 26.02.2016.
 */
public class RectangleExample {
    public static void main(String[] args) {

        Rectangle firstRectangle = new Rectangle();
        firstRectangle.heigth = 2;
        firstRectangle.width = 3;
        firstRectangle.color = "Blue";
        //int a = firstRectangle.heigth;

        int a = firstRectangle.calculateArea();

        System.out.println(a);
        System.out.println(firstRectangle.color);

        Rectangle secondRectangle = new Rectangle();
        secondRectangle.heigth = 5;
        secondRectangle.width = 10;


        secondRectangle.calculateArea();

        int firstRectangleWidth = 3;
        int firstRectangleHeigth = 4;
        int secondRectangleWidth = 5;
        int secondRectangleHeight = 10;

        int area = calsulateArea(firstRectangleHeigth, secondRectangleWidth);
        area = calsulateArea(firstRectangle);

        System.out.println(area);

        Rectangle thirdRectangle = null;

        thirdRectangle.calculateArea();

        firstRectangle.width = 4;



    }

    public static int calsulateArea(int height, int width) {
        return height * width;
    }

    public static int calsulateArea(Rectangle rectangle) {
        return rectangle.heigth * rectangle.width;
    }

}
