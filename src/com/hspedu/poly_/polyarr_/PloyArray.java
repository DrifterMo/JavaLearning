package com.hspedu.poly_.polyarr_;

/**
 * @Author
 * @date 2023/2/28 19:02
 */
public class PloyArray {
    public static void main(String[] args) {
        //应用实例:现有一个继承结构如下：
        //要求创建 1 个 Person 对象、2 个 Student 对象和 2 个 Teacher 对象,
        //统一放在数组中，并调用每个对象 say 方法

        PloyArrayPerson[] persons = new PloyArrayPerson[5];
        persons[0] = new PloyArrayPerson("jack", 20);
        persons[1] = new PloyArrayStudent("smith", 15, 100);
        persons[2] = new PloyArrayStudent("lili", 25, 11100);
        persons[3] = new PloyArrayStudent("小米", 10,)


    }
}
