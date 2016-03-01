package Figure;

/**
 * Created by User on 26.02.2016.
 */
public class Cat {
    private String color;
    private String name;
    private int birthYear;
    private String[] vaccines = new String[10];
    private int vaccinesCount;

    public Cat(String name, String color, int birthYear) {
        System.out.println("cat is creating");
        this.name = name;
        this.color = color;
        this.birthYear = birthYear;
        System.out.println("cat created");
    }


    public void meow(){
        System.out.println("meow!");
    }

    public void vaccinate(String vaccine){
        vaccines[vaccinesCount] = vaccine;
        vaccinesCount++;
        meow();
    }

    public String getName(){
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setName(String name){
        this.name = name;
    }
}
