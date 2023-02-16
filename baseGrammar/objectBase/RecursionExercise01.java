package objectBase;

/**
 * @Author
 * @date 2023/2/13 18:35
 */
public class RecursionExercise01 {

    public static void main(String[] args){
        //斐波那契
        RecursionMonth test = new RecursionMonth();
        int n = 10;
        int num = test.fibonacciSequence(n);
        System.out.println("第" + n + "位的值为：" + num);

        //猴子吃桃
        int day = 1;
        int peach = test.monkeyEatPeach(day);
        System.out.println("第"+ day+"天剩余桃子数为："+peach);
    }

}


class RecursionMonth{
    /**
     * 请使用递归的方式求出斐波那契数 1,1,2,3,5,8,13.....
     * 给你一个整数n，求出他的值是多少
     *
     * 规律： 从第三项开始，每项等于前两项之和
     * n = 1, 1
     * n = 2, 1
     * n = 3, 1+1=2
     * n = 4, 2+1 = 3
     */

    public int fibonacciSequence(int n){
        if (n == 1 || n ==2){
            return 1;
        }else {
            //fibonacciSequence(n - 1);
            return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);

        }
    }


    /**
     * 猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个！
     * 以后每天猴子都吃其中的一半，然后再多吃一个。当到第10天时，想再吃时（即还没吃）
     * 发现只有1个桃子了。
     * 问题：最初共有多少个桃子？    n个桃子
     *
     * day = 10, 1个桃
     * day = 9,  (day10 +1)*2 = 4
     * day = 8   (day9 +1 ) *2 = 10
     * 前一天的桃子 = （后一天+1）*2
     */
    public int monkeyEatPeach(int day){
        if (day == 10){
            return 1;
        }else if (day >= 1 && day <= 9){
            return (monkeyEatPeach(day +1) +1) * 2;
        }else {
            System.out.println("请输入正确天数！！！");
            return -1;
        }
    }
}
