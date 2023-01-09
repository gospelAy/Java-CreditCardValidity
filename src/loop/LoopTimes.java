package loop;

import java.util.Scanner;

public class LoopTimes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for (int i = 1; i <= 12 ; i++) {
            System.out.println(number+ " times " +i+ " is " +number * i);
        }
    }

}
