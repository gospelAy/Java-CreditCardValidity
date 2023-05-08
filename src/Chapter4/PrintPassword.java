package Chapter4;

import java.util.Scanner;

public class PrintPassword {
    public static void main(String[] args){
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password = scanner.nextLine();
        for (int i = 0; i < password.length(); i++) {
            System.out.print("*");
        }
        System.out.println( );
    }
}
