package com.wei.javadesigner.commond;

public class Consumer {
    public static void main(String[] args) {
        KeyBoard receiver = new GigaKeyBoard();
        Mouse razyMouse = new RazyMouse();
        Commond commond = new CommondImpl(receiver,razyMouse);
        Invorker invorker = new Invorker(commond);
        invorker.biosRun();
    }
}
