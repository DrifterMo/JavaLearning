package 面向对象编程_基础;

/**
 * @Author
 * @date 2023/2/14 21:00
 */
public class VarParameterExercise {
    public static void main(String[] args){
        HspMethod method = new HspMethod();
        String result1 = method.nameAndScore("小明", 10, 90);
        String result2 = method.nameAndScore("小明", 10, 90,120);
        String result3 = method.nameAndScore("小明", 10, 90,100,30,150);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

class HspMethod{
    /**
     * 有三个方法，分别实现返回姓名和两门课成绩(总分)，
     * 返回姓名和三门课成绩(总分)，返回姓名和五门课成绩（总分）。
     * 封装成一个可变参数的方法
     */

    public String nameAndScore(String name, int... score){
        int sum = 0;
        for (int i = 0; i < score.length; i++){
            sum += score[i];
        }
        return name + "的" + score.length + "门功课的总分为：" + sum;
    }

}
