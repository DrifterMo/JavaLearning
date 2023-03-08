package com.hspedu.codeblock_;

/**
 * @date 2023/3/7 17:53
 */
public class CodeBlockDetail04 {
    public static void main(String[] args) {
        //(1) 进行类的加载
        //1.1 先加载 父类 A02 1.2 再加载 B02
        //(2) 创建对象
        //2.1 从子类的构造器开始
        new CodeBlockDetail04_B02();//对象
        //new CodeBlockDetail04_C02();
    }
}

class CodeBlockDetail04_A02{    //父类
    private static int n1 = getVal01();

    static {
        System.out.println("CodeBlockDetail04_A02 的一个静态代码块....");
    }

    {
        System.out.println("CodeBlockDetail04_A02 的第一个普通代码块....");
    }

    public int n3 = getVal02();     //普通属性的初始化
    public static int getVal01(){
        System.out.println("getVal01");
        return 10;
    }

    public int getVal02(){
        System.out.println("getVal02");
        return 10;
    }

    public CodeBlockDetail04_A02(){
        //构造器
        //隐藏
        //super()
        //普通代码和普通属性的初始化....
        System.out.println("A02 的构造器");
    }
}


class CodeBlockDetail04_C02{
    private int n1 = 100;
    private static int n2 = 200;
    private void m1(){

    }
    private static void m20(){

    }

    static {
        //静态代码块，只能调用静态成员
        //System.out.println(n1); //错误
        System.out.println(n2);     //ok
        //m1();       //错误
        m20();
    }
    {
        //普通代码块，可以使用任意成员
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m20();
    }

}

class CodeBlockDetail04_B02 extends CodeBlockDetail04_A02{
    private static int n3 = getVal03();
    static {
        System.out.println("CodeBlockDetail04_B02 的一个静态代码块...");
    }
    public int n5 = getVal04();

    {
        System.out.println("CodeBlockDetail04_B02 的第一个普通代码块...");
    }

    public static int getVal03(){
        System.out.println("getVal03");
        return 10;
    }

    public int getVal04(){
        System.out.println("getVal04");
        return 10;
    }

    //构造器
    public CodeBlockDetail04_B02(){
        //隐藏了
        //super()
        //普通代码块和普通属性的初始化...
        System.out.println("CodeBlockDetail04_B02 的构造器被调用....");
        //TODO Auto-generated constructor stub
    }
}