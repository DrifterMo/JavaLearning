package com.hspedu.pkg;

/**
 * @Author
 * @date 2023/2/16 20:35
 */
public class Encapsulation01 {
    public static void main(String[] args) {
        Encapsulation01Person person = new Encapsulation01Person();
        person.setName("韩顺平");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());

        //如果使用构造器指定属性
        Encapsulation01Person smith = new Encapsulation01Person("smith", 80, 500);
        System.out.println("========== smith 的信息===========");
        System.out.println(smith.info());

    }
}

/**
 * 不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。
 * 年龄合理就设置，否则给默认年龄, 必须在 1-120,
 * 年龄， 工资不能直接查看 ， name 的长度在 2-6 字符之间
 */
class Encapsulation01Person{
    public String name;
    private int age;
    private double salary;

    public void say(int n,String name){

    }
    //构造器  alt+insert
    public Encapsulation01Person(){

    }
    //有三个属性的构造器
    public Encapsulation01Person(String name, int age, double salary){
        //this.name = name;
        //this.age = age;
        //this.salary = salary;

        //我们可以将 set 方法卸载构造器中，这样仍然可以验证
        setName(name);
        setAge(age);
        setSalary(salary);


    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        //加入对数据的校验，相当于增加了业务逻辑
        if (name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }else {
            System.out.println("名字长度不对，请输入 2-6字符，默认名字");
            this.name = "匿名用户";
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age >= 1 && age <= 120){
            this.age = age;
        }else {
            System.out.println("请输入正确年龄, 需要 1- 120，默认18岁");
            //给一个默认年龄
            this.age = 18;
        }
    }

    public double getSalary(){
        //可加对当前对象的权限判读。
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public String info(){
        return  "信息为 name = " + name + " age = "+ age + " 薪水 = " + salary;
    }
}