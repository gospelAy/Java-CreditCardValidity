package Chapter4;

import java.util.Scanner;

public class FizzBalls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
                System.out.println(i);
            if (i % 3 == 0){
                System.out.println(" is Buzz");
            } else if (i % 5 == 0) {
                System.out.println(" is Fizz");
            }
            if (i  % 3 == 0 && i % 5 == 0) System.out.println(" is FizzBuzz");
        }
    }
}
