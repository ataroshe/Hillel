package pattern.factory.factory;

import pattern.factory.pizza.Pizza;

/**
 * Created by User on 30.05.2016.
 */
public interface PizzaFactory {
    Pizza createPizza(String type);
}