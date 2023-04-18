package com.hspedu.reflection;

/**
 * @date 2023/4/18
 */
public class Reflection02 {
    public static void main(String[] args) {
        //Field
        //Method
        //Constructor
        m1();
    }

    //传统方法来调用 hi
    public static void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 90; i++){
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法 耗时 = " + (end - start));
    }
}
