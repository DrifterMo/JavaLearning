package com.hspedu.threaduse;

/**
 * @date 2023/4/12
 */
public class Thread03 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}

class T1 implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while(true){
            //每隔1秒输出 “hello，world”， 输出 10 次
            System.out.println("hello,world" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 60){
                break;
            }
        }
    }
}

class T2 implements Runnable{
    int count = 0;

    @Override
    public void run() {
        while (true){
            //每隔 1 秒输出 “hi”,输出 5
            System.out.println("hi" + (++count));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 50){
                break;
            }
        }
    }
}