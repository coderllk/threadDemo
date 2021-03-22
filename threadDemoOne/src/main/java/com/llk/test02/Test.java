package com.llk.test02;

public class Test {
    public static void main(String[] args) {
        NumberThread numberThread = new NumberThread();
        numberThread.setName("numberThread");
        //启动打印数字的线程
        numberThread.start();

        //启动打印字母的线程
        LetterThread letterThread = new LetterThread();
        letterThread.setName("letterThread");
        letterThread.start();
    }
}
