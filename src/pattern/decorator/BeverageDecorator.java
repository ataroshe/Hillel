package pattern.decorator;

/**
 * Created by User on 12.04.2016.
 */
public abstract class BeverageDecorator implements Beverages{
    private Beverages beverage;

    public BeverageDecorator(Beverages beverage) {
        this.beverage = beverage;
    }

    public int cost(){
        return beverage.cost();
    }

    public String description(){
        return beverage.description();
    }
}
