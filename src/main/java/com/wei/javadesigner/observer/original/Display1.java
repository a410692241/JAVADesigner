package com.wei.javadesigner.observer.original;

public class Display1 implements Observer,Display{
    private Integer temperature;
    /**
     * 湿度
     */
    private Integer humidity;
    @Override
    public void display() {
        System.out.println("今天湿度是:"+humidity+";温度至少有:"+temperature);
    }

    @Override
    public void update(Integer temperature, Integer humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
