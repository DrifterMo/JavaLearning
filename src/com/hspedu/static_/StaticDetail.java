package com.hspedu.static_;

/**
 * @date 2023/3/3 19:55
 */
public class StaticDetail {
    public static void main(String[] args) {
        StaticDetailB b = new StaticDetailB();

        //System.out.println(StaticDetailB.n1);   //错误
        System.out.println(StaticDetailB.n2);

        //静态变量是类加载的时候，就创建了，所以我们没有创建对象实例
        //也可以通过 类名.类变量名 来访问
        System.out.println(StaticDetailC.address);
    }
}
class StaticDetailB{
    public int n1 = 100;
    public static int n2 = 200;
}

class StaticDetailC{
    public static String address = "北京";
}