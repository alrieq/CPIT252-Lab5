package edu.kau.fcit.cpit252;

import edu.kau.fcit.cpit252.geoLocation.GeoLocation;
import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

public class Adapter implements WeatherGeo{
    GeoLocation Geo = new GeoLocation();
    WeatherCity weather = new WeatherDBI();
    @Override
    public String getWeatherInfo(double latitude, double longitude) {
        String city = Geo.search(latitude, longitude);
        return weather.getWeatherInfo(city);
    }
    
}
