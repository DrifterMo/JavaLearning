package com.hspedu.object_;

/**
 * @Author
 * @date 2023/3/1 12:10
 */
public class Equals01 {
    public static void main(String[] args){
        EqualsA a = new EqualsA();
        EqualsA b = a;
        EqualsA c = b;
        System.out.println(a == c); //true
        System.out.println(b == c); //true
        EqualsB bObj = a;
        System.out.println(bObj == c);  //true
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);   //true
        //equals 方法，源码怎么查看.
        //把光标放在 equals 方法，直接输入 ctrl+b
        //如果你使用不了. 自己配置. 即可使用.

        /*
        //带大家看看 JDK 的源码 String 类的 equals 方法
        //把 Object 的equals 方法重写了比较两个字符串值是否相同
        public boolean equals(Object anObject) {
            if (this == anObject) {
                return true;
            }
            if (anObject instanceof String) {
                String anotherString = (String)anObject;
                int n = value.length;
                if (n == anotherString.value.length) {
                    char v1[] = value;
                    char v2[] = anotherString.value;
                    int i = 0;
                    while (n-- != 0) {
                        if (v1[i] != v2[i])
                            return false;
                        i++;
                    }
                    return true;
                }
            }
            return false;
        }
         */
        "hello".equals("abc");

        //看看 Object 类的 equls 是
        /*
        //即 Object 的 equals 方法默认就是比较对象地址是否相同
        //也就是判断两个对象是不是同一个对象.
        public boolean equals(Object obj) {
            return (this == obj);
        }
         */

        /*
        //从源码可以看到 Integer 也重写了 Object 的 equals 方法,
        //变成了判断两个值是否相同
        public boolean equals(Object obj){
            if(obj instanceof Integer){
                return value == ((Interger)obj).intValue();
            }
            return false;
        }
         */

        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);
        System.out.println(integer1.equals(integer2));

        String str1 = new String("hspedu");
        String str2 = new String("hspedu");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }

}

class EqualsB{

}

class EqualsA extends EqualsB {

}
