package pattern.factory;

import enums.PizzaType;
import pattern.factory.factory.*;

/**
 * Created by User on 30.05.2016.
 */
public class PizzaMain {
    public static void main(String[] args) {
        PizzaComponensFactory nyComponentFactory = new NyPizzaComponentFactory();
        PizzaStore nyPizzaStore = new PizzaStore(new NyPizzaFactory(nyComponentFactory));
        nyPizzaStore.order(PizzaType.CHEESE);

        PizzaComponensFactory chComponentFactory = new ChPizzaComponentFactory();
        PizzaStore chPizzaStore = new PizzaStore(new ChPizzaFactory(chComponentFactory));
        chPizzaStore.order(PizzaType.MEAT);
    }
}
