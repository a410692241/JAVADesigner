package com.wei.javadesigner.observer.observable;

import java.util.Observable;

public class Weather extends Observable {
    private Integer temperature;
    private Integer humidity;


    /**
     * 测量结果改变了
     */
    public void measurementsChanged() {
        setChanged();
        Display1 display1 = new Display1(this);
        notifyObservers(display1);
    }

    public void setMeasurementsChanged(Integer temperature, Integer humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementsChanged();
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }
}
