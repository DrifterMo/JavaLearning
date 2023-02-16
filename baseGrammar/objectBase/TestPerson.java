package objectBase;

/**
 * @Author
 * @date 2023/2/16 14:16
 */
public class TestPerson {
    public static void main(String[] args){
        TestPersonPerson p1 = new TestPersonPerson("小明",50);
        TestPersonPerson p2 = new TestPersonPerson("小华", 50);

        System.out.println(p1.compateTo(p2));
    }
}


/**
 * 定义 Person 类，里面有 name、age 属性，
 * 并提供 compareTo 比较方法，用于判断是否和另一个人相等，
 * 提供测试类 TestPerson 用于测试, 名字和年龄完全一样，就返回 true, 否则返回 fals
 */
class TestPersonPerson{
    String name;
    int age;
    public TestPersonPerson(String name, int age){
        this.name = name;
        this.age = age;
    }
    public boolean compateTo(TestPersonPerson p){
        return this.name.equals(p.name) && this.age == p.age;
    }
}