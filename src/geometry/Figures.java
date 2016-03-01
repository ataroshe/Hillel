package geometry;

import java.util.Scanner;

public class Figures {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.printf("Choose what you want to calculate? \n 1.Circle area \n 2.Rectangle sides \n");
            Scanner s = new Scanner(System.in);
            String answer = s.nextLine();
            switch (answer) {
                case "Circle area":
                    System.out.printf("Enter radius \n");
                    double circleRadius = s.nextDouble();
                    if (circleRadius > 0) {
                        Circle circle = new Circle(circleRadius);
                        circle.circleArea();
                        System.out.println("Circle's are is: " + circle.getArea());
                    }
                    break;
                case "Rectangle sides":
                    System.out.printf("Enter Rectangle Area and Rectangle Perimeter \n");
                    double rectArea = s.nextDouble();
                    double rectPerimeter = s.nextDouble();
                    if (rectPerimeter > 0 && rectArea > rectPerimeter) {
                        Rectangle rectangle = new Rectangle(rectArea, rectPerimeter);
                        rectangle.rectangleSides();
                        System.out.println("Rectangle sides are: " + rectangle.getX() + " " + rectangle.getY());
                    } else
                        System.out.printf("wrong parameters");
                    break;
                default:
                    System.out.println("Type once again");

            }
        }
    }

}
