//作用是声明当前类所在的包，需要放在类（或者文件）的最上面
//一个类中只能有一句 package
package com.hspedu.pkg;

//import 指令 位置放在 package 的下面，在类定义前面,可以有多句且没有顺序要求
import java.util.Arrays;

/**
 * @Author
 * @date 2023/2/16 15:54
 */
public class Import01 {
    public static void main(String[] args) {
        //使用系统提供的 Arrays 完成数组排序
        int[] arr = {-1, 20, 100, 40, 2};
        //比如对其进行排序
        //传统方法是，自己编写排序（冒泡）
        //系统是提供了相关的类，可以方便完成Arrays

        Arrays.sort(arr);

        //输出其排序结果
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
