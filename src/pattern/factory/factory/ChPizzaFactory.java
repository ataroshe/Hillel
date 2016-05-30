package pattern.factory.factory;

import pattern.factory.pizza.ChicagoCheesePizza;
import pattern.factory.pizza.ChicagokMeetPizza;
import pattern.factory.pizza.Pizza;

/**
 * Created by User on 30.05.2016.
 */
public class ChPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese": return new ChicagoCheesePizza();
            case "Meat": return new ChicagokMeetPizza();
            default:
                throw new RuntimeException("unexpected pizza type. Expected Meat or Cheese, found: " + type);
        }
    }
}
