package pattern.factory.factory;

import pattern.factory.factory.PizzaComponensFactory;
import pattern.factory.pizza.ingridients.cheese.Cheese;
import pattern.factory.pizza.ingridients.cheese.Parmejano;
import pattern.factory.pizza.ingridients.dough.Dough;
import pattern.factory.pizza.ingridients.dough.Thin;
import pattern.factory.pizza.ingridients.proteins.Meat;
import pattern.factory.pizza.ingridients.proteins.Proteins;

/**
 * Created by User on 30.05.2016.
 */
public class NyPizzaComponentFactory implements PizzaComponensFactory {
    @Override
    public Cheese createCheese() {
        return new Parmejano();
    }

    @Override
    public Dough createDought() {
        return new Thin();
    }

    @Override
    public Proteins createProteins() {
        return new Meat();
    }
}
