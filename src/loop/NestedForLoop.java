package loop;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.print("loop"+i + "-->");
            for (int j = 0; j < 10; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
