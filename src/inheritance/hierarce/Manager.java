package inheritance.hierarce;

/**
 * Created by User on 04.03.2016.
 */
public class Manager extends Employee{

    public void fire(Employee employee){
        System.out.println(employee.getName() + " " + employee.position + " fired by " + position + " " + getName());
    }

    public void greeting(){
        System.out.println("Hello, I'm manager, my name is: " + getName());
    }


}
