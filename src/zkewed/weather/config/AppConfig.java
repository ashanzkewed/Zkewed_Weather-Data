/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkewed.weather.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import zkewed.weather.views.Weather;

/**
 *
 * @author DELL
 */
@Configuration
@EnableAsync
@EnableScheduling
public class AppConfig {

    public  void run() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Weather w = new Weather();
        w.setVisible(true);
    }
}
