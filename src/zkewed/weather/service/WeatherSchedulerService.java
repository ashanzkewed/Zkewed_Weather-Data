package zkewed.weather.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * This is a sample class to execute scheduler on specific date based on
 * <code>java.util.Calendar</code>. Over here, <code>executor</code> is a
 * runnable which run on everyday basis from 8:00 AM to 5:00 PM.
 *
 * @author Chintan Patel
 */
@Component
public class WeatherSchedulerService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(cron = "0 08 1 * * ?")
    public void run() {
        boolean runWeatherManual = WeatherService.runWeatherManual();
        System.out.println("run : "+runWeatherManual);
    }

}
