package Figure;

/**
 * Created by User on 26.02.2016.
 */
public class Cat implements Comparable {
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

    @Override
    public int compareTo(Object o) {
        Cat other = (Cat) o;
        if (birthYear > other.birthYear){
            return -1;
        }
        else if (birthYear < other.birthYear) {
            return 1;
        }
        else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", birthYear=" + birthYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (birthYear != cat.birthYear) return false;
        if (!color.equals(cat.color)) return false;
        return name.equals(cat.name);

    }

    @Override
    public int hashCode() {
        int result = color.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + birthYear;
        return result;
    }
}
