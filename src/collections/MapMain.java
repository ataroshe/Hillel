package collections;

import inheritance.hierarce.Person;

import javax.swing.tree.RowMapper;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by User on 29.03.2016.
 */
public class MapMain {
    public static void main(String[] args) {


        Map<Person, Integer> personToDiscount = new HashMap<>();

        personToDiscount.put(new Person("Vasya"), 10);
        personToDiscount.put(new Person("Petya"), 10);
        personToDiscount.put(new Person("Vova"), 10);

        personToDiscount.put(new Person("Vasya"), 20);

        Integer vasyaDiscount = personToDiscount.get(new Person("Vasya"));

        System.out.println(vasyaDiscount);

        doStuff(personToDiscount);

        for (Map.Entry<Person,Integer> personIntegerEntry : personToDiscount.entrySet()) {
            System.out.println(personIntegerEntry.getKey() + "' s discount is " + personIntegerEntry.getValue());
        }

        // так хуже
        for (Person person : personToDiscount.keySet()) {
            personToDiscount.get(person);
        }


    }

    private static void doStuff (Map<Person, Integer> personToDiscount){
        personToDiscount.put(new Person("Ashot"), 95);
    }

}
