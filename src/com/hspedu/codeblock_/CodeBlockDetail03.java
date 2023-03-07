package com.hspedu.codeblock_;

/**
 * @date 2023/3/7 16:58
 */
public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new CodeBlockDetail03_BBB();
    }
}

class CodeBlockDetail03_AAA{
    //父类Object

    {
        System.out.println("CodeBlockDetail03_AAA 的普通代码块");
    }

    public CodeBlockDetail03_AAA(){
        //(1) super()
        //(2) 调用本类的普通代码块
        System.out.println("CodeBlockDetail03_AAA() 构造器被调用....");
    }
}

class CodeBlockDetail03_BBB extends CodeBlockDetail03_AAA{
    {
        System.out.println("CodeBlockDetail03_BBB 的普通代码块....");
    }
    public CodeBlockDetail03_BBB(){
        //(1) super()
        //(2) 调用本类的普通代码块
        System.out.println("CodeBlockDetail03_BBB() 构造器被调用...");
    }
}
