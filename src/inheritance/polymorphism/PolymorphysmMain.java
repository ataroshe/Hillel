package inheritance.polymorphism;

import inheritance.hierarce.Employee;
import inheritance.hierarce.Person;

import java.util.Objects;

/**
 * Created by User on 11.03.2016.
 */
public class PolymorphysmMain {
    public static void main(String[] args) {
        Object o = new Object();

        print(o);

        print(new Person("Vasya"));

        print(new Employee("Vanya"));

        Object[] objects = new Object[3];

        objects[0] = o;
        objects[1] = new Person("Petya");
        objects[2] = new Employee("Vasya");

        print(objects);

        System.out.println("Person Vasya contains in array: " + contains(objects, new Person("Vasya")));
    }

    public static void print(Objects[] objects) {
        for (Object o : objects) {
            System.out.println(o);
        }
    }

    public static void print(Object o) {
        System.out.println(o);
    }

    public static boolean contains(Object[] objects, Object o) {
        for (Object object : objects) {
            if (object.equals(o)) {
                return true;
            }
        }
        return false;
    }
}

