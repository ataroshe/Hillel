package inheritance.hierarce;

/**
 * Created by User on 04.03.2016.
 */
public class Employee extends Person{
    protected String position;

    public Employee () {

    }

    public Employee (String name) {
        super(name);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {

        return position;
    }

    public void greeting() {
        System.out.println("Hello, I'm employee, my name is " + getName());
    }


    public String getName() {
        return super.getName().toUpperCase() + "!";
    }
}
