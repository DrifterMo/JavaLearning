package com.hspedu.poly_.polyparameter_;

/**
 * @Author
 * @date 2023/3/1 9:51
 */
public class EmployeeWorker extends Employee{
    public EmployeeWorker(String name, double salary){
        super(name, salary);
    }

    public void work(){
        System.out.println("普通员工：" + getName() + " is working");
    }

    @Override
    public double getAnnual() {     //因为普通员工没有其他收入，则直接调用父类方法
        return super.getAnnual();
    }
}
