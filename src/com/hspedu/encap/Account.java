package com.hspedu.encap;

/**
 * @Author
 * @date 2023/2/17 14:34
 */
public class Account {
    public static void main(String[] args){
        AccountTest account = new AccountTest("小明", 25, "123456");
        System.out.println("输出信息：name = " + account.getName() + ",余额 = "+account.getBalance() + ",密码 = "+ account.getPassword());
    }
}
