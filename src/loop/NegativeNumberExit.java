package loop;

import java.util.Scanner;

public class NegativeNumberExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number, enter any negative number to exist ");
        int number = input.nextInt();

        while (number != -3) {
            System.out.println("enter a number, enter any negative number to exist ");
        }
        if (number % 2 == 0){
            System.out.println("dis is an even number");
        }else System.out.println("dis is an odd number");

    }
}
