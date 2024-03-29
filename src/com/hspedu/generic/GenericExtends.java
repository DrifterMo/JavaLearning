package com.hspedu.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @date 2023/4/11
 */
public class GenericExtends {
    public static void main(String[] args) {
        Object o = new String("xx");

        //泛型没有继承性
        //List<Object> list = new ArrayList<String>();

        //举例说明下面三个方法的使用
        List<Object> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<AA_GenericExtends> list3 = new ArrayList<>();
        List<BB_GenericExtends> list4 = new ArrayList<>();
        List<CC_GenericExtends> list5 = new ArrayList<>();

        //如果是 List<?> c ,可以接受任意的泛型类型
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //List<? extends AA> c: 表示 上限，可以接受 AA 或者 AA子类
        //printCollection2(list1);    // ×
        //printCollection2(list2);    // ×
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        //List<? super AA> c: 支持 AA类 以及 AA类的父类，不限于直接父类
        printCollection3(list1);
        //printCollection3(list2);    // ×
        printCollection3(list3);
        //printCollection3(list4);    // ×
        //printCollection3(list5);    // ×


        //冒泡排序
        //插入排序
        //。。。
    }

    // ? extends AA 表示 上限，可以接受 AA 或者 AA子类
    // 规定了泛型的上限
    public static void printCollection2(List<? extends AA_GenericExtends> c){
        for (Object object:c){
            System.out.println(object);
        }
    }

    //说明：List<?> 表示 任意的泛型类型都可以接受
    public static void printCollection1(List<?> c){
        for (Object object: c){
            System.out.println(object);
        }
    }

    // ? super 子类类名 AA: 支持 AA类 以及 AA类的父类，不限于直接父类，
    //规定了泛型的下限
    public static void printCollection3(List<? super AA_GenericExtends> c){
        for (Object object: c){
            System.out.println(object);
        }
    }
}

class AA_GenericExtends{

}

class BB_GenericExtends extends AA_GenericExtends{

}

class CC_GenericExtends extends BB_GenericExtends{

}