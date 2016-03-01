package Figure;

/**
 * Created by User on 26.02.2016.
 */
public class Rectangle {
    static int sides = 4;
    int width;
    int heigth;
    String color;

    public Rectangle() {
    }

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public int calculateArea(){
        return width * heigth;
    }

    public void changeSidesConunt(){
        sides = sides + 1;
    }

    public String toString() {
        String result = "Rectangle(a=" + width + " , b=" + heigth + ")";
        return result;
    }

    public boolean equals(Rectangle other){
        return  width == other.width && heigth == other.heigth;
    }
}
