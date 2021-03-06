package collections;

/**
 * Created by User on 22.03.2016.
 */
public class ListElement {
    private Object value;
    private ListElement next;

    public ListElement(Object value) {
        this.value = value;
    }

    public int size(){
        if (next == null) {
            return 1;
        }
        else {
            return next.size() +1;
        }
    }

    public Object get(int index) {
        if (index == 0){
            return value;
        }
        else {
            if (next == null) {
                throw new IndexOutOfBoundsException();
            }
            return next.get(index -1);
        }
    }

    public void add(Object o){
        if (next == null) {
            next = new ListElement(o);
        }
        else {
            next.add(o);
        }
    }

    public Object getValue() {
        return value;
    }

    public ListElement getNext() {
        return next;
    }
}
