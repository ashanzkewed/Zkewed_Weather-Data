/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkewed.weather.config;

import java.io.IOException;
import java.net.BindException;
import java.net.InetAddress;
import java.net.ServerSocket;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import zkewed.instance.WeatherViewSingleton;
import zkewed.weather.views.WeatherView;

/**
 *
 * @author DELL
 */
@Configuration
@EnableAsync
@EnableScheduling
public class AppConfig {

    public static void run() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        WeatherView w = WeatherViewSingleton.getWeatherViewSingleton().getWeatherView();
        w.setVisible(true);
    }

 

    
    
}
