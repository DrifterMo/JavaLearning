package com.hspedu.poly_.detail_;

/**
 * @author Mo
 * @date 2023/2/26
 */
public class DynamicBinging {
    public static void main(String[] args) {
        /*
        Java动态绑定机制：
        1.当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
        2.当调用对象属性时，没有动态绑定机制，哪里声明，那里使用
         */


        //a 的编译类型 A, 运行类型B
        A a = new B();  //向上转型
        System.out.println(a.sum());    //?   40 -> 30
        System.out.println(a.sum1());   //? 30 -> 20
        System.out.println(a.getI());
    }

}


class A{
    public int i = 10;
    //动态绑定机制

    public int sum(){
        return getI() + 10;
    }

    public int sum1(){
        return i + 10;
    }

    public int getI(){
        return i;
    }
}

class B extends A{
    public int i = 20;

    //public int sum(){
    //    return i + 20;
    //}

    public int getI(){
        return i;
    }

    //public int sum1(){
    //    return i + 10;
    //}
}