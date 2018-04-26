package zkewed.weather.test;

import java.time.LocalDate;
import zkewed.weather.classes.WeatherData;
import zkewed.weather.classes.WeatherDataServiceFactory;
import zkewed.weather.classes.IWeatherDataService;
import zkewed.weather.classes.Location;
import zkewed.weather.exceptions.WeatherDataServiceException;
import zkewed.weather.classes.WeatherDataServiceFactory.service;

/**
 *
 * @author Ohad Cohen
 *
 */
public class TestWeatherProgramme {

    public static void main(String[] args) {
        IWeatherDataService dataService = WeatherDataServiceFactory.getWeatherDataService(service.OPEN_WEATHER_MAP);
        WeatherData data;
        LocalDate localDate = LocalDate.now();
        try {
            data = dataService.getWeatherData(new Location("Panadura", "LK"));
            System.out.println(data.toString());
         
            System.out.println(data.getTemperature().getValue());
         
          
            
        } catch (WeatherDataServiceException e) {
            e.printStackTrace();
        }
    }
}
