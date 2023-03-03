package com.hspedu.object_;

/**
 * @Author
 * @date 2023/3/3 17:35
 */
public class HashCode_ {
    public static void main(String[] args) {
        HashCode_AA aa = new HashCode_AA();
        HashCode_AA aa2 = new HashCode_AA();
        HashCode_AA aa3 = aa;

        System.out.println("aa.hashCode() " + aa.hashCode());
        System.out.println("aa2.hashCode() " + aa2.hashCode());
        System.out.println("aa3.hashCode() " + aa3.hashCode());
    }
}

class HashCode_AA{

}
