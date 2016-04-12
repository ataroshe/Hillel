package pattern.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class Robusta implements Beverages {
    @Override
    public int cost() {
        return 13;
    }

    @Override
    public String description() {
        return "Robusta coffee ";
    }
}
