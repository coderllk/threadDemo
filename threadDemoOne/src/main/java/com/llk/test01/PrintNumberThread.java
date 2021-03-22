package com.llk.test01;

public class PrintNumberThread extends Thread {
    private int number;
    //线程主要执行的任务写在 run() 方法中
    @Override
    public void run(){
        while(number<100){
            System.out.println(Thread.currentThread().getName()+"：输出数字 "+number++);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
