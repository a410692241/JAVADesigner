package com.wei.javadesigner.commond;

public class Consumer {
    public static void main(String[] args) {
        KeyBoard receiver = new GigaKeyBoard();
        Mouse razyMouse = new RazyMouse();
        Box box = new Box(new CommondMouse(razyMouse));
        box.execute();
    }
}
