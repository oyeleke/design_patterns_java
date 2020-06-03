package observer_pattern_weather_station;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
