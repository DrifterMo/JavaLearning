package com.hspedu.exception_;

/**
 * @author Mo
 * @date 2023/3/12
 */
public class ClassCastException_ {
    public static void main(String[] args) {
        A b = new B();  //向上转型
        B b2 = (B) b;   //向下转型，这里是OK
        C c2 = (C) b;   //这里抛出 ClassCastException
    }
}

class A{}
class B extends A{}
class C extends A{}