package com.hspedu.reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @date 2023/4/26
 * 演示如何通过反射获取类的结构信息
 */
public class ReflectionUtils {
    public static void main(String[] args) {

    }

    @Test
    public void api_02() throws ClassNotFoundException {
        //得到 Class 对象
        Class<?> personCls = Class.forName("com.hspedu.reflection.Person");
        //getDeclaredField：获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性 = " + declaredField.getName()
                    + " 该属性的修饰符=" + declaredField.getModifiers()
                    + " 该属性的类型=" + declaredField.getReturnType();
        }

        //getDeclaredMethods: 获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法 = " + declaredMethod.getName()
                    + " 该方法的访问修饰符=" + declaredMethod.getModifiers()
                    + " 该方法返回类型=" + declaredMethod.getru();
        }


    }


    //第一组方法 API
    @Test
    public void api_01() throws ClassNotFoundException {
        //得到 Class 对象
        Class<?> personCls = Class.forName("com.hspedu.reflection.Person");
        //getName: 获取全类名
        System.out.println(personCls.getName());
        //getSimpleName:获取简单类名
        System.out.println(personCls.getSimpleName());
        //getFields:获取所有 public 修饰的属性，包含本类以及父类的
        Field[] fields = personCls.getFields();
        for (Field field : fields) {
            System.out.println("本类以及父类的属性 = " + field.getName());
        }
        //getDeclaredFields:获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有的属性 = " + declaredField.getName());
        }
        //getMethods:获取所有 public 修饰的方法，包含本类和父类的
        Method[] methods = personCls.getMethods();
        for (Method method: methods){
            System.out.println("本类中所有方法 = " + method.getName());
        }
    }
}

class A {
    public String hobby
}
