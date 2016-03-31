package pattern.observer;

/**
 * Created by User on 29.03.2016.
 */
public class WeatherStationMain {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        station.setTemperature(20);
        station.setHumidity(50);
        station.setPreassure(780);
        station.stateChanged();

        station.setTemperature(25);
        station.setHumidity(54);
        station.setPreassure(730);
        station.stateChanged();
    }
}
