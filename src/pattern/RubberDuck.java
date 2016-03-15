package pattern;

import pattern.fly.Fly;
import pattern.quack.Squick;

/**
 * Created by User on 15.03.2016.
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehaviour = new Squick();
        flyBehaviour = new Fly();
    }

    @Override
    public void display(){
        System.out.println("rubber duck");
    }

}
