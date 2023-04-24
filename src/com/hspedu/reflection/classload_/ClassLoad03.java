package com.hspedu.reflection.classload_;

/**
 * @date 2023/4/24
 * 演示类加载-初始化阶段
 */
public class ClassLoad03 {
    public static void main(String[] args) {
        //1、加载 B 类，并生成 B 的 class 对象
        //2、 链接 num = 0
        //3、 初始化阶段
        //      依次自动收集类中的所有静态变量的赋值动作和静态代码中的语句，并合并

    }
}

class B {
    static {
        System.out.println("B 静态代码块被执行");
        num = 300;
    }

    static int num = 100;

    public B(){ //构造器
        System.out.println("B() 构造器被执行");
    }
}