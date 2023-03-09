package com.hspedu.abstract_;

/**
 * @date 2023/3/9 15:08
 */
abstract public class Template {    //抽象类-模板设计模式
    public abstract void job(); //抽象方法

    public void calculateTime() {    //实现方法，调用 job 方法
        //得到开始的时间
        long start = System.currentTimeMillis();
        job();  //动态绑定机制
        //得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间 = " + (end - start));
    }
}
