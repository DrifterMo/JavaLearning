import java.util.Scanner;

/**
 * @Author
 * @date 2023/2/7 14:16
 */
public class ArrayReduce {

    public static void main(String[] args) {
        // 有一个数组 {1， 2， 3， 4， 5}， 可以将该数组进行缩减，提示用户是否继续缩减，
        // 每次缩减最后那个元素。当只剩下最后一个元素，提示，不能再缩减

        int[] arr = {1, 2, 3, 4, 5};
        Scanner myscanner = new Scanner(System.in);

        do {
            System.out.println("是否继续删减?  Y/N:");
            String letter = myscanner.next();
            if (letter.equals("Y") || letter.equals("y")) {

                int[] arrNew = new int[arr.length - 1];

                for (int i = 0; i <= arr.length - 2; i++) {
                    arrNew[i] = arr[i];
                }
                arr = arrNew;

            } else if (letter.equals("N") || letter.equals("n")) {
                break;
            }else {
                System.out.println("请输入正确字符！！！！！");
            }
            System.out.println("========缩减后的数组=========");
            for (int i = 0; i <= arr.length - 1; i++) {
                System.out.print(arr[i] + "\t");
            }
        }while(arr.length > 1);
        if (arr.length == 1){
            System.out.println("无法继续缩减！！！");
        }


    }
}
