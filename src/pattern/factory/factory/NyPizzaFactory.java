package pattern.factory.factory;

import enums.PizzaType;
import pattern.factory.pizza.NewYorkCheesePizza;
import pattern.factory.pizza.NewYorkMeetPizza;
import pattern.factory.pizza.Pizza;
import pattern.factory.pizza.ingridients.cheese.Mozarello;
import pattern.factory.pizza.ingridients.cheese.Parmejano;
import pattern.factory.pizza.ingridients.dough.Thin;
import pattern.factory.pizza.ingridients.proteins.Meat;

/**
 * Created by User on 30.05.2016.
 */
public class NyPizzaFactory implements PizzaFactory {
    PizzaComponensFactory pizzaComponensFactory;

    public NyPizzaFactory(PizzaComponensFactory pizzaComponensFactory) {
        this.pizzaComponensFactory = pizzaComponensFactory;
    }

    @Override
    public Pizza createPizza(PizzaType type) {
        Pizza pizza;
        switch (type) {
            case CHEESE:
                pizza = new NewYorkCheesePizza(pizzaComponensFactory);
                return pizza;
            case MEAT:
                pizza = new NewYorkMeetPizza(pizzaComponensFactory);
                return pizza;
            default:
                throw new RuntimeException("unexpected pizza type. Expected Meat or Cheese, found: " + type);
        }
    }
}
