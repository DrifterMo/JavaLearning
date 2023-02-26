package com.hspedu.poly_.detail_;

/**
 * @author Mo
 * @date 2023/2/26
 */
public class PolyDetail03 {
    public static void main(String[] args) {
        /*
         * instanceOf 比较操作符，用于判断对象的运行类型是否为 XX 类型或 XX 类型的子类型
         */
        BB bb = new BB();
        System.out.println(bb instanceof BB);   //true
        System.out.println(bb instanceof AA);   //true

        //aa编译类型AA，运行类型是BB
        //BB是AA子类
        AA aa = new BB();
        System.out.println(aa instanceof AA);   //true
        System.out.println(aa instanceof BB);   //true

        Object object = new Object();
        System.out.println(object instanceof AA);   //false
        String str = "hello";
        //System.out.println(str instanceof AA);  //错误
        System.out.println(str instanceof Object);  //true

    }
}

class AA {

}

class BB extends AA {

}