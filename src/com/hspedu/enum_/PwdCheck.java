package com.hspedu.enum_;

/**
 * @date 2023/3/13 16:05
 */
public class PwdCheck {
    public static void main(String[] args) {
        String password = "$.a....1";
        String regex = "^(?=.*[a-zA-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,16}$";
        boolean isMatch = password.matches(regex);
        if (isMatch) {
            System.out.println("密码格式正确");
        } else {
            System.out.println("密码格式不正确");
        }

    }
}
