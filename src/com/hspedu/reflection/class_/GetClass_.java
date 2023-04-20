package com.hspedu.reflection.class_;

import com.hspedu.reflection.Car;

/**
 * @date 2023/4/20
 * 演示得到 Class 对象的各种方法（6）
 */
public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        //1、Class.forName
        String classAllPath = "com.hspedu.reflection.Car";
        Class<?> cls1 = Class.forName(classAllPath);
        System.out.println(cls1);

        //2、类名.class, 应用场景：用于参数传递
        Class cls2 = Car.class;
        System.out.println(cls2);

        //3、对象.getClass(), 应用场景，有对象实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);

        //4、通过类加载器【4种】来获取到类的 Class 对象
        //(1) 先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2) 通过类加载器得到 Class 对象
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        //cls1, cls2, cls3, cls4 其实是同一个对象
        System.out.println(cls1.hashCode());    //21685669
        System.out.println(cls2.hashCode());    //21685669
        System.out.println(cls3.hashCode());    //21685669
        System.out.println(cls4.hashCode());    //21685669

        //5、基本数据( int, char, boolean, float, double, byte, long, short) 按如下方式得到 Class 类
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        Class<Float> floatClass = float.class;
        System.out.println(integerClass);
    }
}
