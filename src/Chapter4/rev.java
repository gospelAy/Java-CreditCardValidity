package Chapter4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class rev {
    public static void main(String[] args) {
        int[] number = {12, 32, 2, 32, 1, 4, 2};
        System.out.println(Arrays.toString(arraysOfNumber(number)));
//        int[] number = {12, 32, 3, 4, 223, 23};
//        for (int i = number.length - 1; i >= 0; i--) {
//            System.out.print(number[i]+ " ");
//        }
    }
    public static int[] arraysOfNumber(int[] arr){
        for (int i = arr.length - 1; i >0; i--) {
            int firstArray = arr[i];
            int[] secondArray = arr;
        }
        return arr;
    }
}
