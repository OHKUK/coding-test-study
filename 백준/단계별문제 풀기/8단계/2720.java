import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            int money = in.nextInt();

            int quarter = money / 25;
            money %= 25;

            int dime = money / 10;
            money %= 10;

            int nickel = money / 5;
            money %= 5;

            int penny = money;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }

        in.close();
    }
}