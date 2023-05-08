package Chapter4;

public class Main {
    public static void main(String... args){
        int[] numbers = {34, 5, 65, 6, 43, 34};
        reverseArray(numbers);
    }
    public static void reverseArray(int[] array){
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
