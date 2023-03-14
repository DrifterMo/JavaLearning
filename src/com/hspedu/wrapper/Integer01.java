package com.hspedu.wrapper;

/**
 * @date 2023/3/13 19:36
 */
public class Integer01 {
    public static void main(String[] args) {
        //演示 int <--> Integer 的装箱和拆箱
        //jdk5 前是手动装箱和拆箱
        //手动装箱 int -> Integer
        int n1 = 100;
        Integer integer = new Integer(n1);  // 写法1
        Integer integer1 = Integer.valueOf(n1); //写法2

        //手动拆箱
        //Integer -> int
        int i = integer.intValue();

        //jdk5 后，就可以自动装箱和自动拆箱
        int n2 = 200;
        //自动装箱 int -> Integer
        Integer integer2 = n2;
        //自动拆箱 Integer -> int
        int n3 = integer2;
    }
}
