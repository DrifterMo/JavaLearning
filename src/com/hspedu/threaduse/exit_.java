package com.hspedu.threaduse;

/**
 * @author Mo
 * @date 2023/4/13
 */
public class exit_ {
    public static void main(String[] args) {
        AThread st = new AThread();
        new Thread(st).start();
        for (int i = 0; i <= 60; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("main 线程运行中" + i);
            if (i == 30){
                //中断StopThread
                st.setLoop(false);
            }
        }
    }
}

class AThread implements Runnable {

    //步骤1：定义标记变量，默认为 TRUE
    boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("AThread 运行中.....");
        }
    }

    //步骤3：提供公共的set 方法，用户更新 loop
    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}