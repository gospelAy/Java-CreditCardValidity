package Chapter4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the mile driven: ");
        int mile = input.nextInt();

        System.out.println("Enter the gallons used: ");
        int gallon = input.nextInt();

        System.out.println("do you want to continue? Y/N: ");
        char response = input.next().charAt(0);

        int mileAdd = 0;
        int gallonAdd = 0;

        while (response != 'N' && response != 'n') {
            System.out.println("Enter the mile driven: ");
            mileAdd += input.nextInt();

            System.out.println("Enter the gallons used: ");
            gallonAdd += input.nextInt();

            System.out.println("do you want to continue? Y/N: ");
            response = input.next().charAt(0);
        }

        int totalMiles = mile + mileAdd;
        int totalGallons = gallon + gallonAdd;

        float milePerGallon =(float) totalMiles/totalGallons;

        System.out.println(milePerGallon);

    }
}