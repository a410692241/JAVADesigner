package com.wei.javadesigner.decoration.IO;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        int read;
        try {
            IOExample io = new IOExample(new BufferedInputStream(new FileInputStream("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt")));
            while ((read = io.read()) >= 0) {
                System.out.print((char) read);
            }
            io.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
