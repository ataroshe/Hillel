package geometry;

import java.util.Arrays;
import java.util.Scanner;

public class Figures {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.printf("Choose what you want to calculate? \n 1.Triangle perimeter \n 2.Rectangle sides \n 3.Circle area \n");
            Scanner s = new Scanner(System.in);
            String answer = s.nextLine();
            switch (answer) {
                case "Circle area":
                    System.out.printf("Enter radius \n");
                    double circleRadius = s.nextDouble();
                    System.out.println("Circle's are is: " + Circle.circleArea(circleRadius));
                    break;
                case "Rectangle sides":
                    System.out.printf("Enter Rectangle Area and Rectangle Perimeter \n");
                    double rectArea = s.nextDouble();
                    double rectPerimeter = s.nextDouble();
                    double[] sides = Rectangle.rectangleSides(rectArea, rectPerimeter);
                    System.out.println("Rectangle sides are: " + Arrays.toString(sides));
                    break;
                case "Triangle perimeter":
                    System.out.printf("Enter Triangle sides dimensions \n");
                    int triangleX = s.nextInt();
                    int triangleY = s.nextInt();
                    int triangleZ = s.nextInt();
                    System.out.println("Triangle's perimeter is: " + Trangle.trianglePerimeter(triangleX,triangleY, triangleZ));
                    break;
                default:
                    System.out.println("Type once again");

            }
        }
    }

}
