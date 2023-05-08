package Chapter4;

public class Return {
    public static void main(String... args){
        String[] newArray = {"Ab1396", "Q2RBs", "G381ac"};
        System.out.println(" The number of Digit in the array is " + printArray(newArray));
    }
     static int count;
    public static int printArray(String[] arr){
        for (String s : arr) {
            for (int j = 0; j < s.length(); j++) {
                if (Character.isDigit(s.charAt(j))) {
                    count++;
                }
            }
        }
        return count;
    }
}
