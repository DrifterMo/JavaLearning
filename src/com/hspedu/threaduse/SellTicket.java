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