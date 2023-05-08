package Chapter4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MenstrualCycleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the last day of your menstrual cycle (YYYY-MM-DD): ");
        String lastDayString = scanner.nextLine();
        LocalDate lastDay = LocalDate.parse(lastDayString);

        System.out.print("Enter the number of months you want to calculate your next cycle for: ");
        int months = scanner.nextInt();

        System.out.println("Your next menstrual cycles will be on the following dates:");

        LocalDate nextCycle = lastDay;
        for (int i = 1; i <= months; i++) {
            nextCycle = nextCycle.plusDays(28); // assuming a 28-day cycle
            int diffDays = (int) ChronoUnit.DAYS.between(lastDay, nextCycle);
            int extraDays = diffDays % 28;
            nextCycle = nextCycle.minusDays(extraDays);
            String formattedDate = nextCycle.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            System.out.println("Cycle " + i + ": " + formattedDate);
            lastDay = nextCycle;
        }
    }
}


