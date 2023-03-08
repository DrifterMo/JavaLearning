package com.hspedu.single_;

/**
 * @date 2023/3/8 13:10
 */
public class SingleTon01 {
    public static void main(String[] args) {
        //GirlFriend xh = new GirlFriend("小红");
        //GirlFriend xb = new GirlFriend("小白");

        //通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);

        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println(instance2);

        System.out.println(instance == instance2);
        System.out.println(GirlFriend.n1);
    }
}

class GirlFriend{
    private String name;
    public static int n1 = 100;
    //为了能够在静态方法中，返回 gf 对象，需要将其修饰为 static 对象，
    //通常是重量级对象，饿汉式可能造成创建了对象，但是没有使用
    private static GirlFriend gf = new GirlFriend("小红红");

    //如何保障我们只能创建一个 GirlFriend 对象
    //步骤[单例模式 - 饿汉式]
    //1. 将构造器私有化
    //2. 在类的内部直接创建对象 (该对象是 static)
    //3. 提供一个公共的 static 方法，返回 gf 对象
    private GirlFriend(String name){
        System.out.println("构造器被调用");
        this.name = name;
    }

    public static GirlFriend getInstance(){
        return gf;
    }

    public String toString(){
        return "GirlFriend{" + "name=" + name + "\\" +"}";
    }
}