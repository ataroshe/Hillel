package pattern.observer;

import java.util.Random;

/**
 * Created by User on 29.03.2016.
 */
public class ForecastDisplay implements Observer{
    private int temperature;
    private int humidity;
    private int preassure;
    private Random random = new Random();

    @Override
    public void update(int temperature, int humidity, int preassure){
        this.preassure = randomize(preassure);
        this.humidity = randomize(humidity);
        this.temperature = randomize(temperature);
    }

    public void display(){
        System.out.println("forecast temperature is: " + temperature + ", humidity is: " + humidity + ", preassure is: " + preassure);
    }

    private int randomize(int value) {
        double seed = random.nextDouble() / 5 + 0.9;
        return (int) (value * seed);
    }
}
