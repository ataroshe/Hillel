package collections;

import Figure.Cat;

import java.util.ArrayList;

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

        Object tom = list.get(1);
    }
}
