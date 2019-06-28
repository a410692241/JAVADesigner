package com.wei.javadesigner.observer.observable;

import java.util.Observable;
import java.util.Observer;

public class Display2 implements Observer,Display {
    Observable observable;
    /**
     * 湿度
     */
    private Integer humidity;
    private Integer temperature;


    public Display2(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void display() {
        System.out.println("今天湿度是:" + humidity + ";温度是:" + temperature + "℃");
    }


    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof Weather) {
            Weather weather = (Weather) observable;
            this.temperature = weather.getTemperature();
            this.humidity = weather.getHumidity();
        }

        display();
    }
}
