package pattern.decorator;

/**
 * Created by User on 12.04.2016.
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Beverages arabica = new Arabica();
        Beverages robusta = new Robusta();

        arabica = new Milk(arabica);
        arabica = new Milk(arabica);

        robusta = new Cream(robusta);
        robusta = new Milk(robusta);


        printBeverages(arabica);
        printBeverages(robusta);


    }

    public static void printBeverages(Beverages beverage) {
        System.out.println("price is: " + beverage.cost() + ", " + beverage.description());
    }
}
