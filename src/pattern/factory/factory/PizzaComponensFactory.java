package pattern.factory.factory;

import pattern.factory.pizza.ingridients.cheese.Cheese;
import pattern.factory.pizza.ingridients.dough.Dough;
import pattern.factory.pizza.ingridients.proteins.Proteins;

/**
 * Created by User on 30.05.2016.
 */
public interface PizzaComponensFactory {

    Cheese createCheese();

    Dough createDought();

    Proteins createProteins();
}
