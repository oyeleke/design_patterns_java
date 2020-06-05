package observer_pattern_weather_station;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {

    private ArrayList observers;
    private float temperature, humidity, pressure;

    public WeatherData() {
        observers = new ArrayList();
    }




    public void onMeasurementChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this. humidity = humidity;
        this.pressure = pressure;
        onMeasurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
