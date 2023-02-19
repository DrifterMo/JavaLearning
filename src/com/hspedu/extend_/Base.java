package com.hspedu.extend_;

/**
 * @author Mo
 * @date 2023/2/20
 */

//父类
public class Base extends TopBase{
    //4个属性
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;


    //无参构造器
    public Base(){
        System.out.println("父类 Base() 构造器被调用....");
    }

    //有参构造器
    public Base(String name, int age){
        //默认 super()
        System.out.println("父亲 Base(String name)构造器被调用....");
    }

    public int getN4() {
        return n4;
    }
    public void test100(){
        System.out.println("test100");
    }

    protected void test200(){
        System.out.println("test200");
    }

    void test300(){
        System.out.println("test300");
    }
    private void test400(){
        System.out.println("test400");
    }
    //call
    public void callTest400(){
        test400();
    }
}
