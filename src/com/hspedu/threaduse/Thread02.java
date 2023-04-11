package com.hspedu.threaduse;

/**
 * @date 2023/4/11
 * 通过实现接口 Runnable 来开发线程
 */
public class Thread02 {
}

class Animal{

}

class Tiger extends Animal implements Runnable{
    @Override
    public void run(){
        System.out.println("老虎嗷嗷叫。。。。");
    }
}

//线程代理类，模拟一个极简的 Thread 类
class ThreadProxy implements Runnable{//可以把 Proxy 类当做 ThreadProxy
    private Runnable target = null; //属性，类型是 Runnable

    @Override
    public void run(){
        if (target != null){
            target.run();   //动态绑定（运行类型 Tiger)
        }
    }

    public ThreadProxy(Runnable target){
        this.target = target;
    }

    public void start(){
        start0();
    }

}