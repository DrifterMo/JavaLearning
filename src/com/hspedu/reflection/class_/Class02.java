package com.hspedu.reflection.class_;

import com.hspedu.reflection.Cat;

/**
 * @date 2023/4/19
 * 演示 Class 类的常用方法
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        String classAllPath = "com.hspedu.reflection.Car";
        //1、获取到 Car 类 对应的 Class 对象
        //<?> 表示不确定的 Java 类型
        Class<?> cls = Class.forName(classAllPath);
        //2、输出 cls
        System.out.println(cls);    //显示 cls 对象，是哪个类的 Class 对象 com.hspedu.Car
        System.out.println(cls.getClass()); //输出 cls 运行类型 java.lang.Class
        //3、得到包名
        System.out.println(cls.getPackage().getName()); //包名
        //4、得到全类名
        System.out.println(cls.getName());
        //5、通过 cls 创建对象实例
        Cat car = (Cat) cls.newInstance();
        System.out.println(car);
        //6、通过反射获取属性 brand


    }
}
