package 二维数组;

/**
 * @Author
 * @date 2023/2/8 18:55
 */
public class YangHui {
    public static void main(String[] args){
        /**
         *         1                    第1行 1个元素
         *         1 1                  第2行 2个元素
         *         1 2 1                第3行 3个元素
         *         1 3 3 1              第4行 4个元素
         *         1 4 6 4 1            第5行 5个元素
         *         1 5 10 10 5 1        第6行 6个元素
         *         ....
         *
         *         【提示】
         *         第一行有1个元素，第n行有n个元素
         *         每一行的第一个元素和最后一个元素都是1
         *         从第三行开始，对于非第一个元素和最后一个元素的元素的值，arr[i][j]
         *         arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
         */
        int totalLevel = 10;


    }
}
