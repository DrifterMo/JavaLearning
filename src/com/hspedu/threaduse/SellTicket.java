package com.hspedu.threaduse;

/**
 * @date 2023/4/12
 */
public class SellTicket {
    public static void main(String[] args) {
        ////继承 Tread 类实现，会出现超卖
        //SellTick01 sellTick01 = new SellTick01();
        //SellTick01 sellTick02 = new SellTick01();
        //SellTick01 sellTick03 = new SellTick01();
        //sellTick01.start();
        //sellTick02.start();
        //sellTick03.start();

        System.out.println("=====使用实现接口方式来售票========");
        SellTicket02 sellTicket02 = new SellTicket02();
        //第 1 个线程 —— 窗口
        new Thread(sellTicket02).start();
        //第 2 个线程 —— 窗口
        new Thread(sellTicket02).start();
        //第 3 个线程 —— 窗口
        new Thread(sellTicket02).start();
    }
}

//实现接口方式，使用 synchronized 实现线程同步
class SellTicket03 implements Runnable{
    private int ticketNum = 100;    //让多个线程共享 ticketNum
    private boolean loop = true;    //控制 run 方法
    Object object = new Object();
    //同步方法（静态的）的锁为当前类本身
    //1.public synchronized static void m1(){} 锁是加载 SellTicket03.class
    //2.如果在静态方法中，实现一个同步代码块
    /*
        synchronized (SellTicket03.class){
            System.out.println("m2");
        }
     */
    public synchronized static void m1(){

    }

    public static void m2() {
        synchronized ( SellTicket03.class){
            System.out.println("m2");
        }
    }

    //1、public synchronized void sell(){} 就是一个同步方法
    //2、这时锁在 this 对象
    //3、也可以在代码块上写 Synchronize，同步代码块，互斥锁还是在 this 对象
    public /*synchronized*/ void sell(){//同步方法，在同一时刻，只能有一个线程来执行sell 方法
        synchronized (/*this*/ object) {
            if (ticketNum <= 0){
                System.out.println("售票结束。。。。");
                loop = false;
                return;
            }

            //休眠50好眠
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票 "
            + " 剩余票数=" + (--ticketNum));
        }

    }

}



//使用 Tread 方式
class SellTick01 extends Thread {
    //多个线程共享 ticketNum
    private static int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束。。。");
                break;
            }

            //休眠 50 毫秒，模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数=" + (--ticketNum));
        }
    }
}

class SellTicket02 implements Runnable {
    private int ticketNum = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketNum <= 0) {
                System.out.println("售票结束。。。");
                break;
            }

            //休眠 50 毫秒，模拟
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数=" + (--ticketNum));//1 -0--1  --2
        }
    }
}