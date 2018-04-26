/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkewed.weather.service;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import zkewed.weather.classes.IWeatherDataService;
import zkewed.weather.classes.Location;
import zkewed.weather.classes.WeatherData;
import zkewed.weather.classes.WeatherDataServiceFactory;
import zkewed.weather.exceptions.WeatherDataServiceException;
import zkewed.weather.model.City;
import zkewed.weather.model.Weather;
import zkewed.weather.repository.WeatherRepo;

/**
 *
 * @author DELL
 */
public class WeatherService {

    public static boolean runWeatherManual() {
        int count = 0;
        List<City> allCities = WeatherRepo.getAllCities();
        for (City city : allCities) {
            boolean res = getWeatherFromOpenWeatherAPI(city);
            if (res != false) {
                count++;
            }
        }
        return allCities.size() == count;
    }

    public static boolean getWeatherFromOpenWeatherAPI(City city) {
        IWeatherDataService dataService = WeatherDataServiceFactory.getWeatherDataService(WeatherDataServiceFactory.service.OPEN_WEATHER_MAP);
        WeatherData data;
        try {
            LocalDate localDate = LocalDate.now();
            data = dataService.getWeatherData(new Location(city.getCityName(), "LK"));
            Weather weather = new Weather();
            weather.setCity(city);
            weather.setDate(localDate.toString());
            weather.setClouds(data.getClouds().getValue());
            weather.setHumidity(data.getHumidity().toString());
            weather.setPressure(data.getPressure().toString());
            weather.setRain(data.getPrecipitation().getMode());
            weather.setTemp(data.getTemperature().getValue());
            weather.setWeatherCode(data.getWeather().getNumber());

            Serializable res = WeatherRepo.addWeather(weather);

            if (res != null) {
                return true;
            }

        } catch (WeatherDataServiceException e) {
            e.printStackTrace();
        }
        return false;

    }

}
