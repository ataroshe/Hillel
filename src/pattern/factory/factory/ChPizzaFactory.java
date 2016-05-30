package pattern.factory.factory;

import enums.PizzaType;
import pattern.factory.pizza.ChicagoCheesePizza;
import pattern.factory.pizza.ChicagokMeetPizza;
import pattern.factory.pizza.Pizza;
import pattern.factory.pizza.ingridients.cheese.Mozarello;
import pattern.factory.pizza.ingridients.cheese.Parmejano;
import pattern.factory.pizza.ingridients.dough.Thick;
import pattern.factory.pizza.ingridients.proteins.Meat;

/**
 * Created by User on 30.05.2016.
 */
public class ChPizzaFactory implements PizzaFactory {

    PizzaComponensFactory pizzaComponensFactory;

    public ChPizzaFactory(PizzaComponensFactory pizzaComponensFactory) {
        this.pizzaComponensFactory = pizzaComponensFactory;
    }

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new ChicagoCheesePizza(pizzaComponensFactory);
                return pizza;
            case MEAT:
                pizza = new ChicagokMeetPizza(pizzaComponensFactory);
                return pizza;
            default:
                throw new RuntimeException("unexpected pizza type. Expected Meat or Cheese, found: " + type);
        }
    }
}
