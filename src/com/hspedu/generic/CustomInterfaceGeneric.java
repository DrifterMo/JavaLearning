package com.hspedu.generic;

/**
 * @date 2023/4/8
 */
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

/**
 * 泛型接口使用的说明
 * 1、接口中，静态成员也不能使用泛型
 * 2、泛型接口的类型，在继承接口或者实现接口时确定
 * 3、没有指定类型，默认为Object
 */

//在集成接口 指定泛型接口的类型
interface IA extends IUsb<String, Double>{

}


interface IUsb<U,R>{
    int n = 10;
    //U name; 不能这样使用
    //普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //在 jdk 8中，可以在接口中，使用默认方法，也可以使用泛型
    default R method(U u){
        return null;
    }

}