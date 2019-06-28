package com.wei.javadesigner.decoration.starbucks;

public class Main {
    public static void main(String[] args) {
//        BigCup bigCup = new BigCup();
//        System.out.println(bigCup.getDescription() + "一杯普通咖啡要支付:" + bigCup.cost());
//
//        MoCa moCa = new MoCa(new BigCup());
//        System.out.println(moCa.getDescription() + "一杯大杯摩卡咖啡要支付:" + moCa.cost());
//
//        Milk milk = new Milk(new SmallCup());
//        System.out.println(milk.getDescription() + "一杯小杯奶茶咖啡要支付:" + milk.cost());

        //如果需要扩充装饰类,比如添加需要按杯子计费,那么在超类Beverage上加上getSize属性(表示所有的咖啡,杯子都要计费)
        Soy soy = new Soy(new SmallCup());
        System.out.println(soy.getDescription() + "一杯soy咖啡要支付:" + soy.cost());
    }
}
