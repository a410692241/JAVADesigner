package com.wei.javadesigner.observer.original;

/**
 * @Author Awake-Hu
 * @Description
 * @Date 2019/6/24 11:41
 **/
public class Display2 implements Observer,Display{
    private Integer temperature;
    /**
     * 湿度
     */
    private Integer humidity;
    @Override
    public void display() {
        System.out.println("今天湿度是:"+humidity+";温度是:"+temperature);
    }

    @Override
    public void update(Integer temperature, Integer humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
}
