package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 29.03.2016.
 */
public class StatisticDisplay {
    private List<Integer> temperatures = new ArrayList<Integer>();
    private List<Integer> humidities = new ArrayList<Integer>();
    private List<Integer> preassures = new ArrayList<Integer>();

    public void update(int temperature, int humidity, int preassure){
        temperatures.add(temperature);
        humidities.add(humidity);
        preassures.add(preassure);
    }

    public void display(){
        System.out.println("temperatures is: " + temperatures + ", humidities is: " + humidities + ", preassures is: " + preassures);
    }

}
