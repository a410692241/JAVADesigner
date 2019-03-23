package com.wei.javadesigner.commond;

public class CommondKeyBoard implements Commond {
    private KeyBoard keyBoard;

    public CommondKeyBoard(KeyBoard keyBoard) {
        this.keyBoard = keyBoard;
    }

    @Override
    public void execute() {
        keyBoard.initKeyBoard();
    }
}
