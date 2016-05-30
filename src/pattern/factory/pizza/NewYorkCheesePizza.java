package pattern.factory.pizza;

import pattern.factory.factory.PizzaComponensFactory;

/**
 * Created by User on 30.05.2016.
 */
public class NewYorkCheesePizza extends Pizza {
    public NewYorkCheesePizza(PizzaComponensFactory pizzaComponensFactory) {
        dough = pizzaComponensFactory.createDought();
        cheese = pizzaComponensFactory.createCheese();
    }

    @Override
    public void box(){
        System.out.println("Boxing in New York box");
    }
}
