package Chapter4;

import java.util.Objects;
import java.util.Scanner;

public class Palin {
    public static void main(String...args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number to check if it's a palindrome number");
        String palindrome = scanner.nextLine();

        String reverse = "";
        for (int i = palindrome.length(); i > 0; i--) {
            if (!Objects.equals(palindrome, reverse))
                System.out.println("The is number is not a palindrome");
            if (Objects.equals(palindrome, reverse))
                System.out.println("This number is a palindrome number");
        }
    }
}
