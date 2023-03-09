package com.hspedu.innerclass;

/**
 * @date 2023/3/9 11:30
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04{  //外部类
    private int n1 = 10;    //属性
    public void method(){   //方法
        //基于接口的匿名内部类
        //1. 需求：想使用 IA 接口，并创建对象
        //2. 传统方式，是写一个类，实现改接口，并创建对象
        //3. 老韩需求是 Tiger/Dog 类只是使用一次，后面再不使用
        //4. 可以使用匿名内部类来简化开发
        //5. tiger 的编译类型？
        //6. tiger 的运行类型？
        //7. jdk 底层在创建匿名内部类 Outer04$1，立即马上就创建了 Outer04$1 实例，
        // 并且把地址返回给 tiger
        //8. 匿名内部类使用一次，就不能再使用
        IA tiger = new IA(){
            public void cry(){
                System.out.println("老虎叫唤......");
            }
        };
        System.out.println("tiger 的运行类型=" + tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();

        //IA tiger = new Tiger();
        //tiger.cry();

        //演示基于类的匿名内部类
        //分析
        //1. father 编译类型 Father
        //2. father 运行类型 Outer04$2
        //3. 底层会创建匿名内部类
        /*

         */

        //4. 同时也直接返回了 匿名内部类 Outer04$2 的对象
        //5. 注意("jack") 参数列表会传递给 构造器
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了 test 方法");
            }
        };
        System.out.println("father 对象的运行类型=" + father.getClass());
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头.....");
            }
        };
        animal.eat();
    }
}

interface IA{   //接口
    public void cry();
}

//class Tiger implements IA{
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤......");
//    }
//}
//
//class Dog implements IA{
//    @Override
//    public void cry() {
//        System.out.println("小狗汪汪......");
//    }
//}

class Father{   //类
    public Father(String name){ //构造器
        System.out.println("接收到 name=" + name);
    }
    public void test(){ //方法

    }
}

abstract class Animal{  //抽象类
    abstract void eat();
}