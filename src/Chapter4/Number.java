package Chapter4;

import java.util.Scanner;

public class Number {
    public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        String num = scanner.nextLine();

        for (int i = 0; i <num.length() ; i++) {
            System.out.print(num.charAt(i) + " ");
        }
    }
}
