package com.hspedu.poly_.polyparameter_;

/**
 * @Author
 * @date 2023/3/1 9:54
 */
public class PloyParameter {
    public static void main(String[] args){
        EmployeeWorker tom = new EmployeeWorker("tom", 2500);
        EmployeeManager milan = new EmployeeManager("milan", 5000,
                200000);
        PloyParameter ployParameter = new PloyParameter();
        ployParameter.showEmpAnnal(tom);
        ployParameter.showEmpAnnal(milan);

        ployParameter.testWork(tom);
        ployParameter.testWork(milan);
    }

    //showEmpAnnual(Employee e)
    //实现获取任何员工对象的年工资，并在main方法中调用该方法 [e.getAnnual()]
    public void showEmpAnnal(Employee e){
        System.out.println(e.getAnnual());  //动态绑定机制
    }

    //添加一个方法，testWork 如果是普通员工，则调用 work 方法，如果是经理，则调用 manage 方法
    public void testWork(Employee e){
        if (e instanceof EmployeeWorker){
            ((EmployeeWorker) e).work();  //有向下转型操作
        } else if (e instanceof EmployeeManager) {
            ((EmployeeManager) e).manage(); //有向下转型操作
        }else {
            System.out.println("不做处理 ....");
        }
    }
}
