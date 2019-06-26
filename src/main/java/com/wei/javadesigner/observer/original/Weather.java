package com.wei.javadesigner.observer.original;

import java.util.ArrayList;
import java.util.List;

public class Weather implements Subject {
    private List<Observer> observers= new ArrayList<>();
    private Integer temperature;
    private Integer humidity;

    public Weather(Integer temperature, Integer humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObject(Observer display) {
        if (observers.contains(display)) {
            observers.remove(display);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity);
        }
    }
}
