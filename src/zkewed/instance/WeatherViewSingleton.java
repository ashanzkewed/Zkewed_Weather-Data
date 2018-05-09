/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkewed.instance;

import zkewed.weather.views.WeatherView;

/**
 *
 * @author DELL
 */
public class WeatherViewSingleton {

    private static WeatherViewSingleton weatherViewSingleton;
    private WeatherView weatherView;

    private WeatherViewSingleton() {
        weatherView = new WeatherView();
    }

    public WeatherView getWeatherView() {
        return weatherView;
    }

    public static WeatherViewSingleton getWeatherViewSingleton() {
        if (weatherViewSingleton == null) {
            weatherViewSingleton = new WeatherViewSingleton();

        }
        return weatherViewSingleton;
    }

}
