package Chapter4;

public class Small {
    public static void main(String... args) {
        int[] number = {23, 2, 3, 121, 3, 222222, 3, 4, 232, 12, 1};

        int smallestNumber = number[0];
        int largestNumber = number[0];

        for (int j : number) {
            if (j > largestNumber) largestNumber = j;
            if (j < smallestNumber) smallestNumber = j;
        }
        System.out.println("The smallest number in the array is " +smallestNumber);
        System.out.println("the largest number in the array is " +largestNumber);
    }
}
