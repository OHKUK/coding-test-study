import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int count[] = new int[42];
        int n = 0;

        for (int i = 0; i < 10; i++) {
            int num = in.nextInt();
            count[num % 42] = 1;
        }

        for (int i = 0; i < 42; i++) {
            if (count[i] == 1) {
                n++;
            }
        }

        System.out.println(n);
    }
}