package com.hspedu.single_;

/**
 * @date 2023/3/8 20:37
 */
public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);

        Cat instance2 = Cat.getInstance();
        System.out.println(instance2);

        System.out.println(instance == instance2);
        System.out.println(Cat.n1);
    }
}


/*
希望在程序运行过程中，只能创建一个 Cat 对象
使用单例模式
 */
class Cat{
    private String name;
    public static int n1 = 999;
    private static Cat cat; //默认是null

    /*
    步骤：
    1、仍然构造器私有化
    2、定义一个 static 静态属性对象
    3、提供一个 public 的 static 方法，返回一个 Cat 对象
    4、懒汉式：只有当用户使用 getInstance 时，才会返回 Cat 对象，
       后面再次调用时，会返回上次创建的 cat 对象，从而保证了单例
     */
    private Cat(String name){
        System.out.println("构造器调用....");
        this.name = name;
    }

    public static Cat getInstance(){
        if (cat == null){   //如果没有创建 cat 对象
            cat = new Cat("小可爱");
        }
        return cat;
    }
    public String toString(){
        return "Cat{" + "name="+ name + "\"" + '}';
    }
}