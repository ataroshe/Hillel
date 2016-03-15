package pattern;

import pattern.fly.Fly;
import pattern.quack.Quack;
import pattern.quack.QuackBehaviour;

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
