package main.model.display;

import main.model.Observable;
import main.model.Observer;
import main.model.data.WeatherData;

/**
 * created by ersya
 */
public class ForecastWeatherDisplay implements Observer, DisplayElement {

    public ForecastWeatherDisplay(WeatherData weatherData){
        weatherData.registerObserver(this);
    }

    @Override
    public void update(Observable o) {
        display();
    }

    @Override
    public void display() {
        System.out.println("It will be rain");
    }
}
