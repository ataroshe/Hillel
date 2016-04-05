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
    public void update(WeatherStation station){
        this.preassure = randomize(station.getPreassure());
        this.humidity = randomize(station.getHumidity());
        this.temperature = randomize(station.getTemperature());
    }

    public void display(){
        System.out.println("forecast temperature is: " + temperature + ", humidity is: " + humidity + ", preassure is: " + preassure);
    }

    private int randomize(int value) {
        double seed = random.nextDouble() / 5 + 0.9;
        return (int) (value * seed);
    }
}
