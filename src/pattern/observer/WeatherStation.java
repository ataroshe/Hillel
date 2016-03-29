package pattern.observer;

/**
 * Created by User on 29.03.2016.
 */
public class WeatherStation {
    private int temperature;
    private int humidity;
    private int preassure;

    private CurrentDisplay currentDisplay = new CurrentDisplay();
    private StatisticDisplay statisticDisplay = new StatisticDisplay();
    private ForecastDisplay forecastDisplay = new ForecastDisplay();

    public void stateChanged(){
        currentDisplay.update(temperature, humidity, preassure);
        statisticDisplay.update(temperature, humidity, preassure);
        forecastDisplay.update(temperature, humidity, preassure);

        currentDisplay.display();
        statisticDisplay.display();
        forecastDisplay.display();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPreassure() {
        return preassure;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setPreassure(int preassure) {
        this.preassure = preassure;
    }
}
