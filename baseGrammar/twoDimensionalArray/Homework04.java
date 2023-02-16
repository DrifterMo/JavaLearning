package twoDimensionalArray;

import java.util.Scanner;

/**
 * @Author
 * @date 2023/2/8 13:10
 */
public class Homework04 {
    public static void main(String[] args) {
        // 已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序。
        // 比如：[10, 20,45,90],添加23后，数组为[10,12,23,45,90]
        // 比原来的数小？是 加入  否，拷贝原来
        boolean index = false;
        int[] arr = {10, 20, 45, 90};
        int j = 0;
        Scanner myscanner = new Scanner(System.in);
        System.out.println("请输入需要添加的数：");
        int num = myscanner.nextInt();
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0; i <= arr.length - 1; i++) {

            if (num <= arr[i] & !index) { // 判断是否小于等于原来的数  TRUE
                arrNew[j] = num;
                j++;
                arrNew[j] = arr[i];
                j++;
                index = true;

            } else {
                arrNew[j] = arr[i];
                j++;
            }
        }

        arr = arrNew;
        System.out.println("--------新数组-------------");
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    // public static int[] insert(int[] arr, int value) {
    //     int[] newArr = new int[arr.length + 1];
    //     int i = 0;
    //     while (i < arr.length && arr[i] < value) {
    //         newArr[i] = arr[i];
    //         i++;
    //     }
    //     newArr[i] = value;
    //     while (i < arr.length) {
    //         newArr[i + 1] = arr[i];
    //         i++;
    //     }
    //     return newArr;
    // }
    //
    // public static void main(String[] args) {
    //     int[] arr = {1,4,7,9};
    //     int[] insert = insert(arr, 3);
    //     // for (int i : insert) {
    //     //     System.out.println(i);
    //     // }
    //     System.out.println(Arrays.toString(insert));
    // }
}
