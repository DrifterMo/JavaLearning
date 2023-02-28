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
        persons[3] = new PloyArrayTeacher("小米", 10, 8000);
        persons[4] = new PloyArrayTeacher("小华", 20, 10000);

        //循环遍历数组，调用say方法
        for (int i = 0; i < persons.length; i++){
            //persons[i] 编译类型是 Person， 运行类型是根据实际情况由JVM来判断
            System.out.println(persons[i].say());   //动态绑定机制
            //使用 类型判断 + 向下转型
            if (persons[i] instanceof PloyArrayStudent){    //判断 person[i] 的运行类型是不是 Student
                PloyArrayStudent student = (PloyArrayStudent) persons[i];
                student.say();
                // 小伙伴也可以使用一条语句 ((PloyArrayStudent) person[i]).study();
            } else if (persons[i] instanceof PloyArrayTeacher) {
                PloyArrayTeacher teacher = (PloyArrayTeacher) persons[i];
                teacher.teach();
            } else if (persons[i] instanceof PloyArrayPerson) {
                //System.out.println("你的类型有无，请自己检查....");
            }else {
                System.out.println("你的类型有无，请自己检查....");
            }
        }


    }
}
