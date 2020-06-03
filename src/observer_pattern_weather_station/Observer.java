package observer_pattern_weather_station;

public interface Observer {

    void update(float temp, float humidity, float pressure);
}
