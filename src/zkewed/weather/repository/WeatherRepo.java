/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkewed.weather.repository;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Session;
import zkewed.weather.config.HibernateUtil;
import zkewed.weather.model.City;
import zkewed.weather.model.Weather;

/**
 *
 * @author DELL
 */
public class WeatherRepo {

    public static Serializable addCity(City city) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Serializable res = session.save(city);
        session.getTransaction().commit();

        session.clear();
        HibernateUtil.getSessionFactory().close();
        return res;
    }
    
     public static Serializable addWeather(Weather weather) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Serializable res = session.save(weather);
        session.getTransaction().commit();

        session.clear();
        HibernateUtil.getSessionFactory().close();
        return res;
    }

    public static List<City> getAllCities() {

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        List<City> list = session.createQuery("from City").list();
        session.getTransaction().commit();

        session.clear();
        HibernateUtil.getSessionFactory().close();
        return list;
    }

}
