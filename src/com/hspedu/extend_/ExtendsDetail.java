package com.hspedu.extend_;

/**
 * @date: 2023/2/20
 */
public class ExtendsDetail {
    public static void main(String[] args) {
        System.out.println("====第1个对象====");
        Sub sub = new Sub();

        System.out.println("====第2个对象====");
        Sub sub2 = new Sub("jack");

        System.out.println("====第3个对象====");
        Sub sub3 = new Sub("king", 10);

        sub.sayOk();

    }
}

