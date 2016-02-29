package geometry;

public class Rectangle {

    public static double[] rectangleSides(double rectangleArea, double rectanglePerimeter){
        double x1 = -((-rectanglePerimeter/2) - Math.sqrt(Math.pow((rectanglePerimeter/2),2) - 4*1*rectangleArea))/2;
        double x2 = -((-rectanglePerimeter/2) + Math.sqrt(Math.pow((rectanglePerimeter/2),2) - 4*1*rectangleArea))/2;
        double[] sides = {x1, x2};
        return sides;
    }

}
