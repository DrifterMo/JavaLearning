package com.hspedu.object_;

/**
 * @Author
 * @date 2023/3/3 18:32
 */
public class ToString_ {
    public static void main(String[] args) {
        /*

         */
        Monster monster = new Monster("小妖怪","巡山的",1000);
        System.out.println(monster.toString() + " hashcode=" + monster.hashCode());

        System.out.println("==当直接输出一个对象时， toString 方法会被默认调用==");
        System.out.println(monster);    //等价 monster.toString()
    }
}

class Monster{
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //重写 toString 方法，输出对象的属性
    //使用快捷键即可 alt + insert -> toString

    @Override
    public String toString() {  //重写后，一般是把对象的属性值输出，当然程序员也可以自己定制
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
    @Override
    protected void finalize() throws Throwable{
        System.out.println("fin......");
    }
}