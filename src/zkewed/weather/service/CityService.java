/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkewed.weather.service;

import java.io.Serializable;
import java.util.List;
import zkewed.weather.classes.IWeatherDataService;
import zkewed.weather.classes.Location;
import zkewed.weather.classes.WeatherData;
import zkewed.weather.classes.WeatherDataServiceFactory;
import zkewed.weather.exceptions.WeatherDataServiceException;
import zkewed.weather.model.City;
import zkewed.weather.repository.WeatherRepo;

/**
 *
 * @author DELL
 */
public class CityService {

    public static boolean addCity(String cityName) {
        City city = new City();
        city.setCityName(cityName);
        Serializable res = WeatherRepo.addCity(city);
        if (res != null) {
            return true;
        }
        return false;
    }

//    public static void getWeather() {
//        IWeatherDataService dataService = WeatherDataServiceFactory.getWeatherDataService(WeatherDataServiceFactory.service.OPEN_WEATHER_MAP);
//        WeatherData data;
//        try {
//            data = dataService.getWeatherData(new Location("Colombo", "LK"));
//            System.out.println(data.toString());
//        } catch (WeatherDataServiceException e) {
//            e.printStackTrace();
//        }
//    }
    public static List<City> getAllCities() {
        return WeatherRepo.getAllCities();
    }
}
