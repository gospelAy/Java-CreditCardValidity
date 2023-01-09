package Chapter4;

public class TwelveDaysOfChristmas {
        public static void main(String[] args) {
            // Iterate through the twelve days
            for (int day = 1; day <= 12; day++) {
                // Print the day
                switch (day) {
                    case 1 -> System.out.print("On the first day of Christmas, my true love gave to me: ");
                    case 2 -> System.out.print("On the second day of Christmas, my true love gave to me: ");
                    case 3 -> System.out.print("On the third day of Christmas, my true love gave to me: ");
                    case 4 -> System.out.print("On the fourth day of Christmas, my true love gave to me: ");
                    case 5 -> System.out.print("On the fifth day of Christmas, my true love gave to me: ");
                    case 6 -> System.out.print("On the sixth day of Christmas, my true love gave to me: ");
                    case 7 -> System.out.print("On the seventh day of Christmas, my true love gave to me: ");
                    case 8 -> System.out.print("On the eighth day of Christmas, my true love gave to me: ");
                    case 9 -> System.out.print("On the ninth day of Christmas, my true love gave to me: ");
                    case 10 -> System.out.print("On the tenth day of Christmas, my true love gave to me: ");
                    case 11 -> System.out.print("On the eleventh day of Christmas, my true love gave to me: ");
                    case 12 -> System.out.print("On the twelfth day of Christmas, my true love gave to me: ");
                }

                // Print the remainder of the verse
                switch (day) {
                    case 12:
                        System.out.println("Twelve drummers drumming,");
                    case 11:
                        System.out.println("Eleven pipers piping,");
                    case 10:
                        System.out.println("Ten lords a-leaping,");
                    case 9:
                        System.out.println("Nine ladies dancing,");
                    case 8:
                        System.out.println("Eight maids a-milking,");
                    case 7:
                        System.out.println("Seven swans a-swimming,");
                    case 6:
                        System.out.println("Six geese a-laying,");
                    case 5:
                        System.out.println("Five gold rings,");
                    case 4:
                        System.out.println("Four calling birds,");
                    case 3:
                        System.out.println("Three French hens,");
                    case 2:
                        System.out.println("Two turtle doves, and");
                    case 1:
                        System.out.println("A partridge in a pear tree.");
                }
            }
        }
    }


