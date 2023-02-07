/**
 * @Author
 * @date 2023/2/7 14:16
 */
public class ArrayReduce {

    public static void main(String[] args){
        // 有一个数组 {1， 2， 3， 4， 5}， 可以将该数组进行缩减，提示用户是否继续缩减，
        // 每次缩减最后那个元素。当只剩下最后一个元素，提示，不能再缩减

        int[] arr = {1, 2, 3, 4, 5};
        int[] arrNew = new int[arr.length -1];

        for (int i = 0; i <= arr.length - 2; i++){
            arrNew[i] = arr[i];
        }
        arr = arrNew;

        System.out.println("========缩减后的数组=========");
        for (int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i] + "\t");
        }

    }
}
