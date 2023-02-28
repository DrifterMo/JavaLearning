package com.hspedu.poly_.polyarr_;

/**
 * @Author
 * @date 2023/2/28 18:58
 */
public class PloyArrayTeacher extends PloyArrayPerson{
    private double salary;

    public PloyArrayTeacher(String name, int age, double salary){
        super(name, age);
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    //重写父类的 say 方法
    @Override
    public String say(){
        return "老师 " + super.say() + "salary " + salary;
    }

    //特有方法
    public void teach(){
        System.out.println("老师 " + getName() + " 正在讲 java 课程....");
    }
}
