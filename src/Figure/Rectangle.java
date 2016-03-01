package Figure;

/**
 * Created by User on 26.02.2016.
 */
public class Rectangle {
    static final int SIDES_OF_RECTANGLE = 4;
    private int width;
    private int heigth;
    private String color;

    public Rectangle() {
    }

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.heigth = heigth;
    }

    public int calculateArea(){
        return width * heigth;
    }

    public String toString() {
        String result = "Rectangle(a=" + width + " , b=" + heigth + ")";
        return result;
    }

    public boolean equals(Rectangle other){
        return  width == other.width && heigth == other.heigth;
    }


    public int getWidth() {
        return width;
    }

    public int getHeigth() {
        return heigth;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
