/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkewed.weather.views;

import java.util.logging.Level;
import java.util.logging.Logger;
import zkewed.weather.config.AppConfig;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {
        Splash s = new Splash();
        s.setVisible(true);
        AppConfig config = new AppConfig();
        try {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                s.setLoad(i);
                if (i == 100) {
                    s.dispose();
                    config.run();
                }
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
