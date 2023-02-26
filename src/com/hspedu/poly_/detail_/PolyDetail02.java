package com.hspedu.poly_.detail_;

/**
 * @Author
 * @date 2023/2/24 12:22
 */
public class PolyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说！属性的值看编译类型

        //向上转型
        PolyDetail02Base base = new Sub();
        System.out.println(base.count); //看编译类型， 10

        Sub sub = new Sub();
        System.out.println(sub.count);
    }



}

class PolyDetail02Base{
    int count = 10;
}

class Sub extends PolyDetail02Base{
    int count = 20;
}
