package pattern.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class Arabica implements Beverages {
    @Override
    public int cost() {
        return 15;
    }

    @Override
    public String description() {
        return "Arabica coffee ";
    }
}
