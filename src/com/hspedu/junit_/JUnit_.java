package com.hspedu.junit_;

import org.junit.Test;

/**
 * @date 2023/4/11
 */
public class JUnit_ {
    public static void main(String[] args) {
        //传统方式
        //new JUnit_().m1();
        //new JUnit_().m2();
    }

    @Test
    public void m1(){
        System.out.println("m1 方法被调用");
    }

    @Test
    public void m2(){
        System.out.println("m2 方法被调用");
    }

    @Test
    public void m3(){
        System.out.println("m3 方法被调用");
    }
}
