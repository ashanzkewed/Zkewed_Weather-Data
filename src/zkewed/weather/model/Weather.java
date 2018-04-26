/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zkewed.weather.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author DELL
 */
@Entity
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int weatherId;
    private String date;
    private String temp;
    private String humidity;
    private String pressure;
    private String clouds;
    private String weatherCode;
    private String rain;

    @ManyToOne
    @JoinColumn(name = "City_Id", nullable = false)
    private City city;

    /**
     * @return the weatherId
     */
    public int getWeatherId() {
        return weatherId;
    }

    /**
     * @param weatherId the weatherId to set
     */
    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    /**
     * @return the dateTime
     */
   
    /**
     * @return the temp
     */
    public String getTemp() {
        return temp;
    }

    /**
     * @param temp the temp to set
     */
    public void setTemp(String temp) {
        this.temp = temp;
    }

    /**
     * @return the humidity
     */
    public String getHumidity() {
        return humidity;
    }

    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    /**
     * @return the pressure
     */
    public String getPressure() {
        return pressure;
    }

    /**
     * @param pressure the pressure to set
     */
    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    /**
     * @return the description
     */
  

    /**
     * @return the weatherCode
     */
    public String getWeatherCode() {
        return weatherCode;
    }

    /**
     * @param weatherCode the weatherCode to set
     */
    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }

    /**
     * @return the rain
     */
    public String getRain() {
        return rain;
    }

    /**
     * @param rain the rain to set
     */
    public void setRain(String rain) {
        this.rain = rain;
    }

    /**
     * @return the city
     */
    public City getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the clouds
     */
    public String getClouds() {
        return clouds;
    }

    /**
     * @param clouds the clouds to set
     */
    public void setClouds(String clouds) {
        this.clouds = clouds;
    }

}
