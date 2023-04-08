package com.hspedu.generic;

import java.util.Arrays;

/**
 * @date 2023/4/8
 */
public class CustomGeneric {
    public static void main(String[] args) {
        //T = Double, R = String, M = Integer
        Tiger_CustomGeneric<Double,String,Integer> g = new Tiger_CustomGeneric<>("jhon");
        g.setT(10.9);   //OK
        //g.setT("yy");  //错误，类型不对 T = Double
        System.out.println(g);
        Tiger_CustomGeneric g2 = new Tiger_CustomGeneric<>("john!!!");
        g2.setT("yy");   //OK ,因为 T=Object "yy"=String 是 Object 子类
        System.out.println("g2=" + g2);
    }
}

//1. Tiger 后面泛型，所以我们把 Tiger 就称为自定义泛型类
//2, T, R, M 泛型的标识符, 一般是单个大写字母
//3. 泛型标识符可以有多个. //4. 普通成员可以使用泛型 (属性、方法)
//5. 使用泛型的数组，不能初始化
//6. 静态方法中不能使用类的泛型
class Tiger_CustomGeneric<T,R,M>{
    String name;
    R r;
    M m;
    T t;
    //因为数组在 new 不能确T的对象，就无法再内存开辟空间
    T[] ts;

    public Tiger_CustomGeneric(String name){
        this.name = name;
    }

    public Tiger_CustomGeneric(R r, M m, T t){
        this.r = r;
        this.m = m;
        this.t = t;
    }

    public Tiger_CustomGeneric(String name,R r, M m, T t){
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }

    //因为静态是和类相关的，在类加载时，对象还没有创建
    //所以，如果静态方法和静态属性使用的了泛型，JVM就无法完成初始化
    //static R r2;
    //public static void m1(M m){
    //
    //}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public R getR(){
        return r;
    }

    public void setR(R r){
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m){
        this.m =  m;
    }

    public  T getT(){
        return t;
    }

    public void setT(T t){
        this.t = t;
    }

    @Override
    public String toString() {
        return "Tiger_CustomGeneric{" +
                "name='" + name + '\'' +
                ", r=" + r +
                ", m=" + m +
                ", t=" + t +
                ", ts=" + Arrays.toString(ts) +
                '}';
    }
}