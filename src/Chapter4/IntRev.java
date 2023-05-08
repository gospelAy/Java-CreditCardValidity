package Chapter4;

public class IntRev {
    public static void main(String... args){
        int convert = 12323;
        String number = String.valueOf(convert);
        for (int i = number.length() - 1; i >= 0; i--) {
            System.out.print(number.charAt(i) + " ");
        }
    }
}
