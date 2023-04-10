package com.hspedu.generic;

/**
 * @date 2023/4/10
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {

    }
}


//泛型方法，可以定义在普通类中，也可以定义在泛型类中
class Car{//普通类
    public void run(){//普通方法

    }

    //说明 泛型方法
    //1、<T,R> 就是泛型
    //2、是提供给 fly 使用的
    public <T,R> void fly(T t, R r){//泛型方法
        System.out.println(t.getClass());
        System.out.println(r.getClass());

    }
}

class Fish<T, R>{//泛型类
    public void run(){//普通方法

    }

    public <U,M> void eat(U u, M m){//泛型方法

    }

    //说明
    //1、下面 hi 方法不是泛型方法
    //2、是 hi 方法使用了类声明的 泛型
    public void hi(T t){

    }
    //泛型方法，可以使用类声明的泛型，也可以使用自己声明的泛型
    public <K> void hello(R r,K k){
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }

}