package pattern.observer;

/**
 * Created by User on 29.03.2016.
 */
public class CurrentDisplay implements Observer{
    private int temperature;
    private int humidity;
    private int preassure;

    public void display(){
        System.out.println("temperature is: " + temperature + ", humidity is: " + humidity + ", preassure is: " + preassure);

    }

    @Override
    public void update(int temperature, int humidity, int preassure){
        this.preassure = preassure;
        this.humidity = humidity;
        this.temperature = temperature;
    }
}
