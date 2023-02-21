package twoDimensionalArray;

import java.util.Scanner;

/**
 * @Author
 * @date 2023/2/8 18:55
 */
public class YangHui {
    public static void main(String[] args){
        /*
                  1                    第1行 1个元素
                  1 1                  第2行 2个元素
                  1 2 1                第3行 3个元素
                  1 3 3 1              第4行 4个元素
                  1 4 6 4 1            第5行 5个元素
                  1 5 10 10 5 1        第6行 6个元素
                  --------------------------------------------------------
                  1 0 0 0 0 0 0        第1行 1个元素    arr[0][0]={{1}}
                  1 1 0 0 0 0 0        第2行 2个元素    arr[1][1] = {{1}.{1}}
                  1 2 1 0 0 0 0        第3行 3个元素    arr[2][2] = {{1},{2},{1}}
                  1 3 3 1 0 0 0        第4行 4个元素
                  1 4 6 4 1 0 0        第5行 5个元素
                  1 5 10 10 5 1        第6行 6个元素
                  ....
          <p>
                  【提示】
                  第一行有1个元素，第n行有n个元素
                  每一行的第一个元素和最后一个元素都是1
                  从第三行开始，对于非第一个元素和最后一个元素的元素的值，arr[i][j]
                  arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
         */

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入要打印的层数：");
        int totalLevel = myScanner.nextInt();

        // 动态开辟空间
        int[][] arr = new int[totalLevel][];
        // 遍历arr每个一维数组
        for (int i =0; i < arr.length; i++){
            // 给每个一维数组空间 new
            // 如果没有给一维数组 new ,那么 arr[i]就是null
            arr[i] = new int[i + 1];

            // 遍历一维数组去赋值
            for (int j = 0; j < arr[i].length; j++){
                //每行第一个和最后一个为1
                if (j == 0 || j == i){
                    arr[i][0] = 1;
                    arr[i][i] = 1;
                }else {
                    // 中间的数为上一层的 同位置+前一位置之和 arr[i-1][j-1] + arr[i-1][j]
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }

        // 循环打印数组
        System.out.println("------杨辉三角------");
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }


    }
}
