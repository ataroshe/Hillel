package pattern.strategy;

import pattern.strategy.fly.FlyNoWay;
import pattern.strategy.quack.Quack;

/**
 * Created by User on 15.03.2016.
 */
public class Decoy extends Duck{

    public Decoy() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }

    @Override
    public void display(){
        System.out.println("decoy");
    }

    @Override
    public void swim() {
        System.out.println("I can't swim");
    }
}
