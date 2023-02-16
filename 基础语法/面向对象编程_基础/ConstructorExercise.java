package 面向对象编程_基础;

/**
 * @Author
 * @date 2023/2/16 10:11
 */
public class ConstructorExercise {
    public static void main(String[] args){
        ConstructorExercisePerson p1 = new ConstructorExercisePerson();
        //下面输出 name = null,age = 18
        System.out.println("p1 的信息 name = " + p1.name + " age = " + p1.age);

        ConstructorExercisePerson p2 = new ConstructorExercisePerson("小明", 50);
        //下面输出 name = 小明，age = 50
        System.out.println("p2 的信息 name = " + p2.name + " age = " + p2.age);

    }
}

/**
 * 在前面定义的 Person 类中添加两个构造器:
 * 第一个无参构造器：利用构造器设置所有人的 age 属性初始值都为 18
 * 第二个带 pName 和 pAge 两个参数的构造器：
 * 使得每次创建 Person 对象的同时初始化对象的 age 属性值和 name 属性值。
 * 分别使用不同的构造器，创建对象.
 */
class ConstructorExercisePerson {
    String name;
    int age;

    public ConstructorExercisePerson(){
        age = 18;
    }

    public ConstructorExercisePerson(String pName, int pAge){
        name = pName;
        age = pAge;
    }
}