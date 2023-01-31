public class AutoConvertDetail {
    public static void main(String args[]){
        //细节1： 有多种类型的数据混合运算时，
        //系统首先自动将所有数据转换成最大的那种数据类型，然后在进行计算
        int n1 = 10;
//        float d1 = n1 + 1.1;   // 错误，结果类型是double   浮点型默认为double类型
//        double d1 = n1 + 1.1;  正确，结果类型为double
        float d1 = n1 +1.1F;     //对，结果类型为float



    }
}
