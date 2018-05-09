/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkewed.instance;

import zkewed.weather.views.Splash;

/**
 *
 * @author DELL
 */
public class SplashSingleton {

    private static SplashSingleton splashSingleton;
    private Splash splash;

    private SplashSingleton() {
        splash = new Splash();
    }

    public Splash getSplash() {
        return splash;
    }

    public static SplashSingleton getSplashSingleton() {
        if (splashSingleton == null) {
            splashSingleton = new SplashSingleton();
        }
        return splashSingleton;
    }

}
