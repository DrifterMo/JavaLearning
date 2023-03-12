package com.hspedu.exception_;

/**
 * @author Mo
 * @date 2023/3/12
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "韩顺平教育";
        //将String转成int
        int num = Integer.parseInt(name);   //抛出NumberFormatException_
        System.out.println(num);
    }
}
