package generics;

import inheritance.hierarce.Person;

import java.util.Comparator;

/**
 * Created by User on 13.05.2016.
 */
public class PersonComparator implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        Person person = (Person) o1;
        return 0;
    }
}
