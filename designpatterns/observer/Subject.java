package designpatterns.observer;

import java.util.Observer;

public interface Subject {
    void registerObserver(java.util.Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
