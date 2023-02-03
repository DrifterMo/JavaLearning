public class AutoConvertDetail {
    public static void main(String[] args){
        //细节1： 有多种类型的数据混合运算时，
        //系统首先自动将所有数据转换成最大的那种数据类型，然后在进行计算
        int n1 = 10;
        // float d1 = n1 + 1.1;   // 错误，结果类型是double   浮点型默认为double类型
        // double d1 = n1 + 1.1;  正确，结果类型为double
        float d1 = n1 +1.1F;     //对，结果类型为float


        /*细节2： 当我们把精度（容量）大的数据类型赋值给精度（容量）小的数据类型时，
        就会报错，反之就会进行自动类型转换。*/

        //int n2 = 1.1;   // 错误，double -> int

        // 细节3：(byte, short) 和 char 之间不会相互自动转换
        // 当把具体数赋给 byte 时，（1）先判断该数是否在byte范围内，如果是就可以
        byte b1 = 10;   // 对，-128-127
        // int n2 = 1;     // n2 是 int
        // byte b2 = n2;   // 错误，如果是变量赋值，判断类型

        // char c1 = b1;   // 错误， byte不能自动转换成char


        // 细节4：byte, short, char 他们三者可以计算，在计算时首先转换为int类型

        byte b2 = 1;
        byte b3 = 2;
        short s1 = 1;
        // short s2 = b2 +s1;  // 错误，b2 + s1 -> int
        int s2 = b2 + s1; // 对。b2 + s1 -> int

        // byte b4 = b2 + b3; // 错误，b3 + b2 -> int

        // boolean 不参与转换
        boolean pass = true;
        // int num100 = pass;  // boolean 不参与类型的自动转换

        // 自动提升原则： 表达式结果的类型自动提升为 操作数中最大的类型
        // 看一道题

        byte b4 = 1;
        short s3 = 100;
        int num200 = 1;
        float num300 = 1.1F;

        double num500 = b4 + s3 + num200;   // float -> double
    }
}
