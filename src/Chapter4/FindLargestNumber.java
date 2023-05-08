package Chapter4;

public class FindLargestNumber {
    public static void main(String[] args){
        int[] numbers = {23, 3, 4, 1, 23, 4321, 34};
        int largeNumber = numbers[0];
        int smallNumber = numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i] > largeNumber) largeNumber = numbers[i];
            if (numbers[i] < smallNumber) smallNumber = numbers[i];
        }
        System.out.println("The smallest Number of the Array is " + smallNumber);
        System.out.println("The largest Number in the Array is " + largeNumber);
    }
}
