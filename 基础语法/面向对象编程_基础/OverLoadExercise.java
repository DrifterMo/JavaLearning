package 面向对象编程_基础;

/**
 * @Author
 * @date 2023/2/14 20:24
 */
public class OverLoadExercise {
    /**
     * 类 Methods 中定义三个重载方法并调用。方法名为 m。
     * 三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。
     * 分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
     * 在主类的 main ()方法中分别用参数区别调用三个方法
     */

    public static void main(String[] args){
        Methods myMethods = new Methods();
        System.out.println("调用方法myMethods.m(int num1):" + myMethods.m(10));
        System.out.println("调用方法myMethods.m(int num1, int num2):" + myMethods.m(10, 20));
        System.out.println("调用方法myMethods.m(String str):" + myMethods.m("你好"));
    }

}

class Methods{
    //平方运算并输出结果
    public int m(int num1){
        return num1*num1;
    }

    //相乘并输出结果
    public int m(int num1, int num2){
        return num1 * num2;
    }

    //输出字符串信息
    public String m(String str){
        return str;
    }
}