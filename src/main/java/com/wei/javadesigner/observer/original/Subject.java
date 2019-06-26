package com.wei.javadesigner.observer.original;
/**
 * @Author Awake-Hu
 * @Description 观察者模式
 * @Date 2019/6/24 11:35
 **/
public interface Subject {

    /**
     * 注册
     */
    void register(Observer observer);


    /**
     * 移除
     */
    void removeObject(Observer display);



    /**
     * 提醒
     */
    public void notifyObserver();

}
