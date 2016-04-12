package pattern.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class Milk extends BeverageDecorator {

    public Milk(Beverages beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        return 10 + super.cost();
    }

    @Override
    public String description() {
        return super.description() + ", milk";
    }
}
