package com.llk.test02;

public class NumberThread extends Thread {

    //每隔 0.5 秒输出一个数字
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        Long start = System.currentTimeMillis();
        System.out.println(name + " 输出数字开始时间："+start);
        for (int i = 0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" 输出数字："+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Long end = System.currentTimeMillis();
        System.out.println(name + " 输出数字结束时间："+end);
    }
}
