/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkewed.weather.test;

import java.util.*;

/**
 *
 * @author DELL
 */
public final class Main extends TimerTask {

    public static void main(String... arguments) {
        TimerTask fetchMail = new Main();
        // perform the task once a day at 4 a.m., starting tomorrow morning
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(fetchMail, getTomorrowMorning4am(), fONCE_PER_DAY);
    }

    @Override
    public void run() {
        System.out.println("doing");
    }
    private final static long fONCE_PER_DAY = 1000 * 60 * 60 * 24;

    private final static int fONE_DAY = 1;
    private final static int fFOUR_AM = 11;
    private final static int fZERO_MINUTES =10;

    private static Date getTomorrowMorning4am() {
        Calendar tomorrow = new GregorianCalendar();
        tomorrow.add(Calendar.DATE, fONE_DAY);
        Calendar result = new GregorianCalendar(tomorrow.get(Calendar.YEAR),
                tomorrow.get(Calendar.MONTH), tomorrow.get(Calendar.DATE), fFOUR_AM,
                fZERO_MINUTES);
        return result.getTime();
    }
}
