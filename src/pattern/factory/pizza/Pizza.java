package pattern.factory.pizza;

import pattern.factory.pizza.ingridients.cheese.Cheese;
import pattern.factory.pizza.ingridients.proteins.Proteins;
import pattern.factory.pizza.ingridients.dough.Dough;

/**
 * Created by User on 30.05.2016.
 */
public class Pizza {

    public Cheese cheese;
    public Dough dough;
    public Proteins proteins;

    public void bake(){
        System.out.println("Baking...");
    }
    public void cut(){
        System.out.println("cutting...");
    }
    public void box(){
        System.out.println("Packing...");
    }

}
