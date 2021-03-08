package com.llk.test02;

public class NumberThread extends Thread {

    //每隔 1 秒输出一个数字
    @Override
    public void run() {
        for (int i = 0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+" 输出数字："+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
