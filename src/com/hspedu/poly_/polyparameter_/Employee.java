package com.hspedu.poly_.polyparameter_;

/**
 * @author Mo
 * @date 2023/3/1
 */
public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    //得到年工资
    public double getAnnual(){
        return 12 * salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
