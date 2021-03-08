package com.llk.test02;

public class LetterThread extends Thread {

    private char[] letters = {'A','B','C','D','E'};


    //每隔 1 秒输出一个字母
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        Long start = System.currentTimeMillis();
        System.out.println(name + " 开始时间："+start);
        for (int i = 0;i<5;i++){

            System.out.println(name+" 输出字母："+letters[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
