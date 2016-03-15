package pattern;

import pattern.fly.Fly;
import pattern.quack.Quack;

/**
 * Created by User on 15.03.2016.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new Fly();
    }

    @Override
    public void display(){
        System.out.println("redhead duck");
    }

}
