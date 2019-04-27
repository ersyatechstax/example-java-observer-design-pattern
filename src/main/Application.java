package main;

import main.model.display.CurrentWeatherDisplay;
import main.model.data.WeatherData;
import main.model.display.ForecastWeatherDisplay;

/**
 * created by ersya
 */
public class Application {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay(weatherData);
        ForecastWeatherDisplay forecastWeatherDisplay = new ForecastWeatherDisplay(weatherData);
        weatherData.setMeasurements((float) 37.2,75,10);
        weatherData.removeObserver(currentWeatherDisplay);
        weatherData.setMeasurements((float) 40.2,30,20);
        weatherData.registerObserver(currentWeatherDisplay);
        weatherData.setMeasurements((float) 35.2,20,40);
    }
}
