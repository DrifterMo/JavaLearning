/**
 * @Author
 * @date 2023/2/1 20:17
 */
public class Stars {
    public static void main(String[] args){
        /*

             *
           *  *
          *    *
         ********
         */


        /*
        1.先打印个矩形

        ********
        ********
        ********
        ********
        ********

        2.打印半个金字塔
        *       // 第1行1个*
        **      // 第2行2个*
        ***     // 第3行3个*
        ****    // 第4行4个*
        *****   // 第5行5个*

        3.打印整个金字塔
        思考错误: 考虑了两边的空格数量,其实只需要考虑*前打印的空格数量即可
            *       // 第一行1个    2*i-1   4个空格    总层数-1
           ***      // 第二行3个    2*i-1   3个空格    总层数-2
          *****     // 第三行5个    2*i-1   2个空格
         *******    // 第四行7个    2*i-1   1个空格
        *********   // 第五行9个    2*i-1   0个空格

        4.打印空心金字塔
            *       // 第1行1个    2*层数-1 4个空格
           * *      // 第2行2个            3+1=4个空格
          *   *     // 第3行2个            2+2=4个空格
         *     *    // 第4行2个            1+3=4个空格
        *********   // 第5行9个            0+0个空格
         */
        int totalLevel = 20;
        for (int i=1; i <= totalLevel; i++){ // i表示层数

            // 空格数
            for (int k = 1; k <= totalLevel-i; k++){
                System.out.print(' ');
            }

                // 控制* 数量
                for (int j = 1; j <= 2 * i - 1; j++) {
                    if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }

                }
            System.out.print('\n');
        }

    }
}