package com.hspedu.reflection.question;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @date 2023/4/17
 * 反射问题的引入
 */
public class ReflectionQuestion {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //根据配置文件 re.properyies 指定信息，创建 Cat 对象并调用方法 Hi

        ////传统的方式 new 对象 -> 调用方法
        //Cat cat = new Cat();
        //cat.hi(); //------> cat.cry()  调用方法;

        //我们尝试做一做 -> 明白反射
        //1. 使用 Properties 类，可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/com/hspedu/reflection/re.properties"));
        String classfullpath = properties.get("classfullpath").toString();  //
        String methodName = properties.get("method").toString();
        System.out.println("classfullpath = " + classfullpath);
        System.out.println("methodName = " + methodName);
        //2. 创建对象，传统的方法行不通 -> 反射机制
        //new classfullpath();

        //3. 使用反射机制解决
        //（1）加载类，返回 Class 类型的对象 cls
        Class cls = Class.forName(classfullpath);
        //（2）通过 cls 得到你加载的类 com.hspedu.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o 的运行类型 = " + o.getClass());    //运行类型
        //（3）通过 cls 得到你加载的类 com.hspedu.Cat 的 methodName"hi" 的方法对象
        //    即：在反射中，可以把方法视为对象（万物皆对象）
        Method method1 = cls.getMethod(methodName);
        //（4）通过 method1 调用方法：即通过方法对象来实现调用方法
        System.out.println("====================================");
        method1.invoke(o);  //传统方法 对象.方法(), 反射机制  方法.invoke(对象)
    }
}
