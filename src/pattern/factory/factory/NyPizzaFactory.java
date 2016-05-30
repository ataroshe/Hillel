package pattern.factory.factory;

import pattern.factory.pizza.NewYorkCheesePizza;
import pattern.factory.pizza.NewYorkMeetPizza;
import pattern.factory.pizza.Pizza;

/**
 * Created by User on 30.05.2016.
 */
public class NyPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "Cheese": return new NewYorkCheesePizza();
            case "Meat": return new NewYorkMeetPizza();
            default:
                throw new RuntimeException("unexpected pizza type. Expected Meat or Cheese, found: " + type);
        }
    }
}
