package pattern.factory;

import enums.PizzaType;
import pattern.factory.factory.PizzaFactory;
import pattern.factory.pizza.Pizza;

/**
 * Created by User on 30.05.2016.
 */
public class PizzaStore {

    pattern.factory.factory.PizzaFactory PizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        PizzaFactory = pizzaFactory;
    }

    public Pizza order(PizzaType type){

        Pizza pizza = PizzaFactory.createPizza(type);


        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

//    private Pizza createPizza(String region, String type) {
//        Pizza pizza;
//
//        if (region.equals("CH")) {
//            switch (type) {
//                case "Cheese": return new ChicagoCheesePizza();
//                case "Meat": return new ChicagokMeetPizza();
//                default:
//                    throw new RuntimeException("unexpected pizza type. Expected Meat or Cheese, found: " + type);
//            }
//        } else if (region.equals("NY")) {
//            switch (type) {
//                case "Cheese": return new NewYorkCheesePizza();
//                case "Meat": return new NewYorkMeetPizza();
//                default:
//                    throw new RuntimeException("unexpected pizza type. Expected Meat or Cheese, found: " + type);
//            }
//        }else {
//                throw new RuntimeException("...");
//            }
//        }
    }