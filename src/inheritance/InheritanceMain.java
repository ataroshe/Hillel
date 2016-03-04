package inheritance;

import inheritance.hierarce.Employee;
import inheritance.hierarce.Manager;
import inheritance.hierarce.Person;

import java.util.Objects;

/**
 * Created by User on 04.03.2016.
 */
public class InheritanceMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Ivan");

        Employee employee = new Employee();
        employee.setPosition("programmer");
        employee.setName("Denis");

        Manager manager = new Manager();
        manager.setPosition("director");
        manager.setName("Igor");
        manager.fire(employee);

        person.getName();

        Person employeeAsPerson = employee;
        Person managerAsPerson = manager;

        employeeAsPerson.getName();
        employee.getPosition();

        managerAsPerson.getName();

        //Manager personAsManager = person; d обратную сторону не работает;

        Employee employee1 = (Employee) employeeAsPerson; //чревато ошибками

        if (employeeAsPerson instanceof Employee) {
            System.out.println("he is employee");
        }

        else {
            System.out.println("he isn't employee");
        }

        Person somebody = manager;

        //somebody.greeting();

        speek(person);
        speek(employeeAsPerson);
        speek(manager);

        Employee employee2 = new Employee();
        employee2.setName("Ivan");

        System.out.println(person.getName());
        System.out.println(employee.getName());
        System.out.println(manager.getName());

    }


    public static void printName(Person person){
        System.out.println("name is" + person.getName());
    }

    public static void speek(Person person){
        person.greeting();
    }



}
