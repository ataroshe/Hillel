package collections;

import Figure.Cat;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

/**
 * Created by User on 18.03.2016.
 */
public class CollectionsMain {
    public static void main(String[] args) {
        ArrayList<Cat> list = new ArrayList<>();
        list.add(new Cat("tom", "grey", 2015));
        list.add(new Cat("ton", "grey", 2015));
        list.add(new Cat("tom", "grey", 2015));


        System.out.println(list);

        Cat tom = list.get(1);

        LinkedList<Cat> linkedList = new LinkedList<>();
        linkedList.add(new Cat("tom", "grey", 2015));
        linkedList.add(new Cat("tom", "grey", 2015));
        linkedList.add(new Cat("tom", "grey", 2015));
        linkedList.add(new Cat("tom", "grey", 2015));

        System.out.println(linkedList.get(1));

        printList(list);
        printList(linkedList);

        Collection<Cat> cats = linkedList;

        TreeSet<Cat> sortedCats = new TreeSet<>(new CatComparator());
        sortedCats.add(new Cat("tom", "grey", 2015));
        sortedCats.add(new Cat("tom", "grey", 2011));
        sortedCats.add(new Cat("tom", "grey", 2013));
        sortedCats.add(new Cat("Murzik", "grey", 2013));

        printForEach(sortedCats);
    }

    public static void printForEach(Collection<Cat> collection){
        for (Cat cat : collection) {
            System.out.println(cat);
        }
    }


    public static void printList (List<Cat> cats) {
        for (int i = 0; i < cats.size(); i++) {
            System.out.println(cats.get(i));
        }
    }
}
