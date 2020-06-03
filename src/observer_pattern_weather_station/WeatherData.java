package observer_pattern_weather_station;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList observers;
    private float temperature, humidity, pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = observers.indexOf(0);

        if(index > 0){
            observers.remove(index);
        }

    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i< observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void onMeasurementChanged(){
        notifyObserver();
    }

    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this. humidity = humidity;
        this.pressure = pressure;
        onMeasurementChanged();
    }
}
