package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class WeatherStation implements Subject{
    private List<java.util.Observer> observers;
    private int temperature;

    public WeatherStation(){
        observers = new ArrayList<>();
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(java.util.Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(java.util.Observer observer){
        observers.remove((observer));
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
