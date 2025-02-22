import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int c = (int)Math.pow(Math.pow(2, n)+1,2);

        in.close();
        System.out.println(c);
    }
}