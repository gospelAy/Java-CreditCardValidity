package Chapter4;

public class Assume {
    public static void main(String[] args){
        int x = 5;
        x += x++ - 5;
        System.out.println(x);
    }
}
