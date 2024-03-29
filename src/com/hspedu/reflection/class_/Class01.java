package com.hspedu.reflection.class_;

import com.hspedu.reflection.Cat;

/**
 * @date 2023/4/19
 * 对 Class 类特点的梳理
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //看看 Class 类图
        //1、Class 也是类，因此也继承Object 类
        //Class
        //2、Class 类对象不是 new 出来的，而是系统创建的
        //(1) 传统 new 对象
        /*  ClassLoader 类
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            return loadClass(name, false);
        }
         */
        Cat cat = new Cat();
        //(2) 反射方式，刚才老师没有 debug 到 ClassLoader 类的 loadClass, 原因是，我没有注销 Cat cat = new
        //Cat();
        /*  ClassLoader 类，仍然是通过 ClassLoader 类加载 Cat 类的 Class 对象
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            return loadClass(name, false);
        }
         */
        Class cls1 = Class.forName("com.hspedu.reflection.Cat");

        //3、对于某个类的 Class 类对象，在内存中只有一份，因此类只加载一次
        Class cls2 = Class.forName("com.hspedu.reflection.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls1.hashCode());
        Class cls3 = Class.forName("com.hspedu.reflection.Cat");
        System.out.println(cls3.hashCode());
    }
}
