package com.llk.test01;

public class ThreadDemo {
    public static void main(String[] args) {
        //创建一个线程实例
        PrintNumberRunnable printNumberRunnable = new PrintNumberRunnable();
        //
        Thread thread = new Thread(printNumberRunnable);
        thread.setName("printNumberRunnable");
        thread.start();
    }
}
