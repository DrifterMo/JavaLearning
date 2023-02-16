package objectBase;

/**
 * @Author
 * @date 2023/2/15 18:04
 */
public class ConstructorDetail {
    public static void main(String[] args) {
        //第1个构造器
        ConstructorDetailPerson p1 = new ConstructorDetailPerson("小明", 40);
        //第2个构造器
        ConstructorDetailPerson p2 = new ConstructorDetailPerson("小华");

        //使用的是默认的无参构造器
        Dog dog1 = new Dog();

    }
}

class Dog {
    /**
     * 如果程序员没有定义构造器，系统会自动给类生成一个默认无参构造器(也叫默认构造器)
     * 使用 javap 指令 反编译看看
     *
     * 默认构造器
     * Dog() {
     *
     * }
     *
     * 一旦定义了自己的构造器,默认的构造器就覆盖了，就不能再使用默认的无参构造器，
     * 除非显式的定义一下,即: Dog(){} 写 (这点很重要)
     */

    public Dog(String dName){
        //...
    }

    //显示的定义一下  无参构造器
    Dog(){

    }
}

class ConstructorDetailPerson{
    String name;
    int age;

    public ConstructorDetailPerson(String pName, int pAge){
        name = pName;
        age = pAge;
    }

    public ConstructorDetailPerson(String pName){

        name = pName;
    }
}