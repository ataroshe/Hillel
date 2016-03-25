package pattern.strategy;

import pattern.strategy.fly.Fly;
import pattern.strategy.quack.Quack;

/**
 * Created by User on 15.03.2016.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new Fly();
    }

    @Override
    public void display(){
        System.out.println("mullard duck");
    }
}
