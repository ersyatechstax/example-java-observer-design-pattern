package main.model.display;

import main.model.Observable;
import main.model.Observer;
import main.model.data.WeatherData;

/**
 * created by ersya
 */
public class CurrentWeatherDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData subject;


    public CurrentWeatherDisplay(WeatherData weatherData){
        this.subject = weatherData;
        subject.registerObserver(this);
    }

    @Override
    public void update(Observable obj) {
        if(obj instanceof  WeatherData){
            this.temperature = ((WeatherData) obj).getTemperature();
            this.humidity = ((WeatherData) obj).getHumidity();
            this.pressure = ((WeatherData) obj).getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current temperature: "+temperature+"C");
        System.out.println("Current humidity: "+humidity+"%");
        System.out.println("Current pressure: "+pressure+ "Pa");
    }
}
