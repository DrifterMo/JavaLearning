package com.hspedu.abstract_;

/**
 * @date 2023/3/9 15:15
 */
public class BB extends Template{
    public void job(){  //这里也去重写了 Template 的 job 方法
        long num = 0;
        for (long i =1;i<=800000;i++){
            num *= i;
        }
    }
}
