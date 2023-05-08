package Chapter4;

import java.util.Arrays;

public class ArrayLcm {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(numberLcm(10)));
    }
    public static int[] numberLcm(int number){
        int [] LcmArray = new int[number];
        int counter = 0;
        int divider = 2;
        while (number > 1){
            if (number % divider == 0){
                number = number / divider;
                LcmArray[counter] = divider;
                counter++;
            }else divider++;
        }
        return Arrays.copyOf(LcmArray, counter);
    }
}
