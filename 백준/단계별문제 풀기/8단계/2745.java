import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int b = in.nextInt();
        int tmp = 1;
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (c - 55) * tmp;
            } else {
                result += (c - 48) * tmp;
            }
            tmp *= b;
        }
        System.out.println(result);

        in.close();
    }
}