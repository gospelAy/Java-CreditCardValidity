package Chapter4;

import java.util.Scanner;

public class Example {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String...runMyCode){
        System.out.println("please kindly Enter your name");
        String name = scanner.nextLine();
        System.out.println("your are welcome " + name + " more money to your account " +
                "");
    }
}
