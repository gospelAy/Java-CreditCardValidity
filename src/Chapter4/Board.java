package Chapter4;

import java.util.Arrays;

public class Board {
    public static void main(String[] args) {
        char[][][] lettersArray = new char[1][3][3];
//        lettersArray[1][0][1] = 'x';
//        lettersArray[0][1] = 'o';
//        lettersArray[0][2] = 'x';
//        lettersArray[0][3] = 'o';
        for (int i = 0; i < lettersArray.length; i++) {
            System.out.println(Arrays.deepToString(lettersArray));

        }
//        if (lettersArray[1][0] == 'x'){
//            System.out.println(1);
//        }
    }

}
