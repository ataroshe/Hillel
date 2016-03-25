package pattern.strategy.fly;

/**
 * Created by User on 15.03.2016.
 */
public class Fly implements FlyBehaviour {
    @Override
    public void fly(){
        System.out.println("I can fly");
    }
}
