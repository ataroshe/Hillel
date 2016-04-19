package IO;

import inheritance.hierarce.Person;

import java.io.Serializable;

/**
 * Created by User on 19.04.2016.
 */
public class Car implements Serializable{
    private final int year;
    private final String brand;
    private final Person owner;
    private transient Rentor rentor;

    public Car(String brand, int year, Person owner) {
        this.brand=brand;
        this.year = year;
        this.owner = owner;

    }

    public void setRentor(Rentor rentor) {
        this.rentor = rentor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", brand='" + brand + '\'' +
                ", owner=" + owner +
                ", rentor=" + rentor +
                '}';
    }
}