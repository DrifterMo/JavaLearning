package com.hspedu.encap;

/**
 * @Author
 * @date 2023/2/17 14:34
 */

/**
 * 创建程序,在其中定义两个类：Account 和 AccountTest 类体会 Java 的封装性。
 * Account 类要求具有属性：姓名（长度为 2 位 3 位或 4 位）、余额(必须>20)、
 * 密码（必须是六位）, 如果不满足，则给出提示信息，并给默认值(程序员自己定)
 * 通过 setXxx 的方法给 Account 的属性赋值。
 * 在 AccountTest 中测试
 */
public class AccountTest {
    private String name;
    private double balance;
    private String password;

    public AccountTest(String name, double banlance, String password) {
        setName(name);
        setBanlance(banlance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    /**
     * 设置名字
     * @param name   名字 2-4
     */
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4){
            this.name = name;
        }else {
            System.out.println("请输入正确的名字（2-4个字符）！！！！");
        }

    }

    public double getBalance() {
        return balance;
    }

    /**
     * 设置余额数
     * @param banlance: 余额，必须大于20
     */
    public void setBanlance(double banlance) {
        if (banlance >= 20){
            this.balance = banlance;
        } else if (banlance < 0) {
            System.out.println("请输入正确余额！！！");
        }else {
            System.out.println("余额必须大于20！！！！！！");
        }
    }

    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     * @param password: 必须6位
     */
    public void setPassword(String password) {
        if (password.length() == 6){
            this.password = password;
        } else if (password.length() != 0) {
            this.name = "123456";
            System.out.println("密码长度错误，设置默认密码为：123456");
        }else {
            System.out.println("请输入密码！！！！");
        }
    }
}
