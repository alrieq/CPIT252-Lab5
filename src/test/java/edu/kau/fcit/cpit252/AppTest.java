package edu.kau.fcit.cpit252;


import edu.kau.fcit.cpit252.weatherDB.WeatherDBI;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class AppTest {
    public void MatchingString(){
        WeatherGeo geo = new Adapter();
        WeatherCity city = new WeatherDBI();
        assertEquals(geo.getWeatherInfo(21.543333, 39.172778),city.getWeatherInfo("Jeddah"));
        
        
    }
}
