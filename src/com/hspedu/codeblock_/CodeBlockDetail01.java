package com.hspedu.codeblock_;

/**
 * @date 2023/3/7 16:14
 */
public class CodeBlockDetail01 {
    public static void main(String[] args) {
        //类被加载的情况距离
        //1. 创建对象实例时(new)
        //CodeBlockDetail01_AA aa = new CodeBlockDetail01_AA();

        //2. 创建子类对象实例，父类也会被加载，而且，父类先被加载，子类后被加载
        //CodeBlockDetail01_AA aa2 = new CodeBlockDetail01_AA();

        //3. 使用类的静态成员时（静态属性，静态方法）
        //System.out.println(CodeBlockDetail01_Cat.n1);
        //static 代码块，是在类加载时，执行的，而且只会执行一次；
        //CodeBlockDetail01_DD dd = new CodeBlockDetail01_DD();
        //CodeBlockDetail01_DD dd1 = new CodeBlockDetail01_DD();
        //普通代码块，在创建对象实例时，会被隐式的调用
        //被创建一次，就会调用一次
        //如果只是使用类的静态成员时，普通代码块并不会执行
        System.out.println(CodeBlockDetail01_DD.n1);
    }
}

class CodeBlockDetail01_DD{
    public static int n1 = 8888;    //静态属性
    //静态代码块
    static {
        System.out.println("CodeBlockDetail01_DD 的静态代码 1 被执行.....");
    }
    //普通代码块，在 new 对象时，被调用，而且每创建一个对象，就调用一次
    //可以这样简单的理解， 普通代码块是构造器的补充
    {
        System.out.println("CodeBlockDetail01_DD 的 普通代码块被执行....");
    }
}

class CodeBlockDetail01_Animal{
    //静态代码块
    static {
        System.out.println("CodeBlockDetail01_Animal 的静态代码 1 被执行....");
    }
}

class CodeBlockDetail01_Cat extends CodeBlockDetail01_Animal{
    public static int n1 = 999; //静态属性
    //静态代码块
    static {
        System.out.println("CodeBlockDetail01_Cat 的静态代码块 1 被执行....");
    }
}

class CodeBlockDetail01_BB{
    //静态代码块
    static {
        System.out.println("CodeBlockDetail01_BB 的静态代码块 1 被执行....");
    }
}

class CodeBlockDetail01_AA extends CodeBlockDetail01_BB{
    //静态代码块
    static {
        System.out.println("CodeBlockDetail01_AA 的静态代码 1 被执行....");
    }
}