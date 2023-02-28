package com.hspedu.poly_.polyparameter_;

/**
 * @author Mo
 * @date 2023/3/1
 */
public class EmployeeManager extends Employee{
    private double bonus;

    public EmployeeManager(String name, double salary, double bonus){
        super(name, salary);
        this.bonus = bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void manage(){
        System.out.println("经理：" + getName() + " is managing");
    }

    @Override
    public double getAnnual(){
        return super.getAnnual() + bonus;
    }
}
