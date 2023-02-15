package 面向对象编程_基础;

/**
 * @Author
 * @date 2023/2/15 17:31
 */
public class Constructor01 {
    public static void main(String[] args){
        //当我们new 一个对象时，直接通过构造器指定名字和年龄

        Constructor01Person p1 = new Constructor01Person("Smith", 80);
        System.out.println("p1的信息如下：");
        System.out.println("p1 对象的name =" + p1.name);
        System.out.println("p1 对象的age = " + p1.age);
    }
}

class Constructor01Person{
    String name;
    int age;

    //构造器
    //1.构造器没有返回值，也不能写void
    //2.构造器的名称和类名Constructor01Person一样
    //3.(String pName, int pAge) 是构造器形参列表，规则和成员方法一样

    public Constructor01Person(String pName, int pAge){
        System.out.println("构造器被调用——————完成对象属性初始化");
        name = pName;
        age = pAge;
    }

}