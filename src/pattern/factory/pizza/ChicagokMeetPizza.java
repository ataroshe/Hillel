package pattern.factory.pizza;

import pattern.factory.factory.PizzaComponensFactory;

/**
 * Created by User on 30.05.2016.
 */
public class ChicagokMeetPizza extends Pizza {
    public ChicagokMeetPizza(PizzaComponensFactory pizzaComponensFactory) {
        dough = pizzaComponensFactory.createDought();
        cheese = pizzaComponensFactory.createCheese();
        proteins = pizzaComponensFactory.createProteins();
    }

    @Override
    public void box(){
        System.out.println("Boxing in Chicago box");
    }
}
