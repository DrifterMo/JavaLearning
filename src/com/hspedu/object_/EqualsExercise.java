package com.hspedu.object_;

/**
 * @Author
 * @date 2023/3/2 10:58
 */
public class EqualsExercise {
    public static void main(String[] args) {
        EqualsExercisePerson person1 = new EqualsExercisePerson("jack", 10,'男');
        EqualsExercisePerson person2 = new EqualsExercisePerson("jack",20,'男');
        System.out.println(person1.equals(person2));
    }
}

/*
判断两个Person 对象的内容是否相等，
如果两个 Person 对象的各个属性值都一样，则返回 true, 反之 false
 */
class EqualsExercisePerson{ //extends Object
    private String name;
    private int age;
    private char gender;

    //重写 Object 的 equals 方法
    public boolean equals(Object obj){
        //判断如果比较的两个对象是同一个对象，则直接返回TRUE
        if (this == obj){
            return true;
        }
        //类型判断
        if (obj instanceof EqualsExercisePerson){   //是 EqualsExercisePerson 类型才进行比较
            //向下转型，因为需要 obj 的各个属性
            EqualsExercisePerson p = (EqualsExercisePerson) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        //如果不是 Person ，则直接返回 false
        return false;
    }

    public EqualsExercisePerson(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}