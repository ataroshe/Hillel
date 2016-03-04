package inheritance.hierarce;

/**
 * Created by User on 04.03.2016.
 */
public class Person {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void greeting(){
        System.out.println("Hello, I'm a person, my name is " + getName());
    }

    @Override
    public boolean equals(Object o){
        if (!(o instanceof Person)) {
            return false;
        }
        Person other = (Person) o;
        return this.getName().equals(other.getName());
    }


}